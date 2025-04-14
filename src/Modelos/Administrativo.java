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
public class Administrativo extends Personal implements Serializable {
    private String departamento;

    public Administrativo() {
    }

    public Administrativo(String departamento, String nombre, String horario, double sueldo) {
        super(nombre, horario, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
       String texto =  super.toString() + 
                        " | Departamento: " + departamento;
       return texto;
    }
    
    
}
