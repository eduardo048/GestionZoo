
package Modelos;

import java.io.Serializable;
import java.time.LocalDate;

public class VisitaConVehiculo implements Serializable {
    private LocalDate fecha;
    private int nVisitantes;
    private String tipo; 
    private int Nbicicletas;
    private String matricula;

    public VisitaConVehiculo(LocalDate fecha, int nVisitantes) {
        this.fecha = fecha;
        this.nVisitantes = nVisitantes;
        this.tipo = tipo;
        this.Nbicicletas = Nbicicletas;
        this.matricula = matricula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getnVisitantes() {
        return nVisitantes;
    }

    public void setnVisitantes(int nVisitantes) {
        this.nVisitantes = nVisitantes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNbicicletas() {
        return Nbicicletas;
    }

    public void setNbicicletas(int Nbicicletas) {
        this.Nbicicletas = Nbicicletas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    

    @Override
    public String toString() {
        String texto =  fecha + " | Numero de vistantes: " + nVisitantes 
                         + "Tipo de vehiculo " + tipo 
                        + "Numero de biciletas " + Nbicicletas
                        + "Matricula " + matricula
                ;
        try{//excepcio sin cuidador un animal
            if(this.tipo ==  null){
                throw new MayorNumeroVisitantesQuePlazas("Mas visitantes que plazas");
            }else{
                System.out.println("Tipo: " + this.tipo);
            }
        }catch(MayorNumeroVisitantesQuePlazas asce){
            texto += "\n Tipo:" + asce.getMessage();
        }

        return texto; 
    }   
}
