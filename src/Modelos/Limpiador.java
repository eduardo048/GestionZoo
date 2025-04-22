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
public class Limpiador extends Personal implements Serializable{
    private String area;

    public Limpiador() {
    }

    public Limpiador( String nombre, String horario, double sueldo, String area) {
        super(nombre, horario, sueldo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        String texto = super.toString() + 
                       "\n Área de Limpieza: " + " | Área: " + area;
        
        return texto;
    } 
    
    public String getAtributoExtra(){
        return area;
    }

    
    
    
}
