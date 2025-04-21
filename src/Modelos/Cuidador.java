/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author eduar
 */
public class Cuidador extends Personal implements Serializable {
    private int experiencia;

    public Cuidador() {
    }

    public Cuidador( String nombre, String horario, double sueldo, int experiencia) {
        super(nombre, horario, sueldo);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    //Mostrar cuidadores
    @Override
    public String toString() {
        String texto = this.getNombre();
       return texto; 
    }  
    
    
    
}
