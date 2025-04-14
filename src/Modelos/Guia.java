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
public class Guia extends Personal implements Serializable {
    private String idioma;

    public Guia() {
    }

    public Guia(String idioma, String nombre, String horario, double sueldo) {
        super(nombre, horario, sueldo);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    @Override
    public String toString() {
        String texto = super.toString() + 
                       " | Idiomas: " + idioma;    
        return texto;
    } 
    
}
