/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Modelos.Animal;
import Modelos.Personal;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;

public class ConexionBBDD {
    private Connection conexion;
    private Statement sentencia;
    private PreparedStatement sentenciaPreparada;
    private ResultSet resultado;
    
    public ConexionBBDD(JLabel estado){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/bbddedupico","root","");
            estado.setText("Conexion con exito a la base de datos");
        }catch(ClassNotFoundException ex){
            estado.setText("Driver JDBC no encontrado");
        }catch(SQLException ex){
            estado.setText("Error de conexion: " + ex.getMessage());
        }
    }
    
    
    public void crearTablas(JLabel estado) {
        try{
            Statement stmt = this.conexion.createStatement();

            // Tabla PERSONAL
            String tablaPersonal = "CREATE TABLE IF NOT EXISTS `personal` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT, "
                    + "`nombre` VARCHAR(50) NOT NULL, "
                    + "`horario` VARCHAR(20) NOT NULL, "
                    + "`sueldo` DOUBLE NOT NULL, "
                    + "`atributo_extra` VARCHAR(100), "
                    + "PRIMARY KEY (`id`)"
                    + ") ENGINE=InnoDB;";

            // Tabla ANIMALES con cuidador y habitat opcionales
            String tablaAnimales = "CREATE TABLE IF NOT EXISTS `animales` ("
                    + "`id` INT NOT NULL AUTO_INCREMENT, "
                    + "`nombre` VARCHAR(50) NOT NULL, "
                    + "`edad` INT NOT NULL, "
                    + "`especie` VARCHAR(50) NOT NULL, "
                    + "`habitat` VARCHAR(50), "
                    + "`cuidador` VARCHAR(50), "
                    + "PRIMARY KEY (`id`)"
                    + ") ENGINE=InnoDB;";

            stmt.execute(tablaPersonal);
            stmt.execute(tablaAnimales);

            estado.setText("Tablas personal y animales creadas correctamente.");

        }catch(SQLException ex){
            estado.setText("Error al crear las tablas: " + ex.getMessage());
        }
    }
    
    //Insertar datos en base de datos animales
    public void guardarTodosLosAnimales(ArrayList<Animal> listaAnimales, JLabel estado) {
        String orden = "INSERT INTO animales (nombre, edad, especie, habitat, cuidador) VALUES (?,?,?,?,?);";

        try{
            this.sentenciaPreparada = this.conexion.prepareStatement(orden);

            for(Animal ani : listaAnimales){
                this.sentenciaPreparada.setString(1, ani.getNombreAnimal());
                this.sentenciaPreparada.setInt(2, ani.getEdad());
                this.sentenciaPreparada.setString(3, ani.getEspecie());

                String nombreHabitat = (ani.getHabitat() != null) ? ani.getHabitat().getNombre() : "Sin hábitat";
                this.sentenciaPreparada.setString(4, nombreHabitat);

                String nombreCuidador = (ani.getCuidador() != null) ? ani.getCuidador().getNombre() : "Sin cuidador";
                this.sentenciaPreparada.setString(5, nombreCuidador);

                this.sentenciaPreparada.executeUpdate();;
            }

            estado.setText("Se han guardado todos los animales.");

        }catch (SQLException ex){
            estado.setText("Error al guardar los animales: " + ex.getMessage());
        }
    }

    //Insertar datos en la base de datos personal
    public void guardarTodoElPersonal(ArrayList<Personal> listaPersonal, JLabel estado) {
        String orden = "INSERT INTO personal (nombre, horario, sueldo,atributo_extra) VALUES (?,?,?,?);";

        try{
            this.sentenciaPreparada = this.conexion.prepareStatement(orden);

            for(Personal per : listaPersonal){
                this.sentenciaPreparada.setString(1, per.getNombre());
                this.sentenciaPreparada.setString(2, per.getHorario());
                this.sentenciaPreparada.setDouble(3, per.getSueldo());
                this.sentenciaPreparada.setString(4, per.getAtributoExtra());
                this.sentenciaPreparada.executeUpdate();
            }

            estado.setText("Se ha guardado todo el personal.");

        }catch (SQLException ex) {
            estado.setText("Error al guardar el personal: " + ex.getMessage());
        }
    }
    
    //Mostrar los animales
    public String obtenerTodosLosAnimales() {
        String texto = "";
        try{
            texto = "\nANIMALES REGISTRADOS EN EL ZOO:";
            String orden = "SELECT * FROM animales;";
            this.sentencia = this.conexion.createStatement();
            this.resultado = this.sentencia.executeQuery(orden);

            while(this.resultado.next()){
                texto += "\nID: " + this.resultado.getInt("id") +
                         " | Nombre: " + this.resultado.getString("nombre") +
                         " | Edad: " + this.resultado.getInt("edad") +
                         " | Especie: " + this.resultado.getString("especie") +
                         " | Hábitat: " + this.resultado.getString("habitat") +
                         " | Cuidador: " + this.resultado.getString("cuidador");
            }
        }catch(SQLException ex){
            texto = "Error al mostrar animales: " + ex.getMessage();
        }
        return texto;
    }

    //Mostrar el personal
    public String obtenerTodoElPersonal() {
        String texto = "";
        try{
            texto = "\nPERSONAL DEL ZOO:";
            String orden = "SELECT * FROM personal;";
            this.sentencia = this.conexion.createStatement();
            this.resultado = this.sentencia.executeQuery(orden);

            while(this.resultado.next()){
                texto += "\nID: " + this.resultado.getInt("id") +
                         " | Nombre: " + this.resultado.getString("nombre") +
                         " | Horario: " + this.resultado.getString("horario") +
                         " | Sueldo: " + this.resultado.getDouble("sueldo") +
                         " | Extra: " + this.resultado.getString("atributo_extra");
            }
        }catch(SQLException ex){
            texto = "Error al mostrar personal: " + ex.getMessage();
        }
        return texto;
    }



}
