/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author eduar
 */
public class Vehiculo {
    private String matricula;
    private int preAlquiler;

    public Vehiculo(String matricula, int preAlquiler) {
        this.matricula = matricula;
        this.preAlquiler = preAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPreAlquiler() {
        return preAlquiler;
    }

    public void setPreAlquiler(int preAlquiler) {
        this.preAlquiler = preAlquiler;
    }
    
    @Override
    public String toString() {
        String texto =  matricula + " " ;
        
        return texto; 
    }
    
    
}
