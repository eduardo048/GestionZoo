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
public class Coche extends Vehiculo implements Serializable{
    private int numeroPlazas;
    private Conductor nombre;

    public Coche(String matricula, int preAlquiler, int numeroPlazas, Conductor nombre) {
        super(matricula, preAlquiler);
        this.numeroPlazas = numeroPlazas;
        this.nombre = nombre;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Conductor getNombre() {
        return nombre;
    }

    public void setNombre(Conductor nombre) {
        this.nombre = nombre;
    }
    
    
    

    

   
    
   
    
    
    
}
