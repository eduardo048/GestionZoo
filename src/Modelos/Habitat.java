/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Habitat implements Serializable {
    private String nombre;
    private String clima;
    private int tamaño;
    private int capacidad;
    private int numeroAnimales;
    private ArrayList<Animal> animales;

    public Habitat(String nombre,String clima, int tamaño, int capacidad, int numeroAnimales) {
        this.nombre = nombre;
        this.clima = clima;
        this.tamaño = tamaño;
        this.capacidad = capacidad;
        this.numeroAnimales = numeroAnimales;
        this.animales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroAnimales() {
        return numeroAnimales;
    }

    public void setNumeroAnimales(int numeroAnimales) {
        this.numeroAnimales = numeroAnimales;
    }
    
    

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

     @Override
    public String toString() {
     String texto =  nombre + " | Clima: " + clima + " | Tamaño: " + tamaño + " m | Capacidad: " + capacidad;
     
     return texto;
    }
    
    
    
    
    
}
