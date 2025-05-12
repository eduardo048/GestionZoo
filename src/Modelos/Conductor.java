
package Modelos;

import java.io.Serializable;

public class Conductor extends Personal implements Serializable {
    
    private String telefono;

    public Conductor(String nombre, String horario, double sueldo, String telefono) {
        super(nombre, horario, sueldo);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public String toString() {
        String texto = super.getNombre();
       return texto; 
    } 
    
    
    public String getAtributoExtra(){
        return String.valueOf(telefono);
    }
    
}
