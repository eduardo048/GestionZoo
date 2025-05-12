/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;



public class Bicicleta extends Vehiculo implements Serializable {
    
    private int nBicicletasAlquiladas;
    private String tipo;

    public Bicicleta(String matricula, int preAlquiler, String tipo) {
        super(matricula, preAlquiler);
        this.tipo = tipo;
    }

    public int getnBicicletas() {
        return nBicicletasAlquiladas;
    }

    public void setnBicicletas(int nBicicletas) {
        this.nBicicletasAlquiladas = nBicicletas;
    }

    public int getnBicicletasAlquiladas() {
        return nBicicletasAlquiladas;
    }

    public void setnBicicletasAlquiladas(int nBicicletasAlquiladas) {
        this.nBicicletasAlquiladas = nBicicletasAlquiladas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String texto =  super.toString() + 
                        " | Numero de bicicletas: " + nBicicletasAlquiladas + "Tipo de bicicleta " + tipo;
       return texto;
    } 
   
}
