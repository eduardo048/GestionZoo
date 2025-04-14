
package Modelos;

import java.io.Serializable;


public class Personal implements Serializable {
    private String nombre;
    private String horario;
    private double sueldo;

    public Personal() {
    }

    public Personal(String nombre, String horario, double sueldo) {
        this.nombre = nombre;
        this.horario = horario;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        
        String texto =  nombre + " | Horario: " + horario + " | Sueldo: " + sueldo + "?";
        return texto; 
    
    }
    
}
