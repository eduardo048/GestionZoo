/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;

/**
 *
 * @author eduar
 */
public class Visitas {
    private LocalDate fecha;
    private int numVisitantes;
    private String guia;
    private String recorrido;

    public Visitas() {
    }

    public Visitas(LocalDate fecha, int numVisitantes, String guia, String recorrido) {
        this.fecha = fecha;
        this.numVisitantes = numVisitantes;
        this.guia = guia;
        this.recorrido = recorrido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumVisitantes() {
        return numVisitantes;
    }

    public void setNumVisitantes(int numVisitantes) {
        this.numVisitantes = numVisitantes;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }
    
    @Override
    public String toString() {
        String texto = fecha + " | Visitantes: " + numVisitantes + " | Guía: " + guia + " | Recorrido: " + recorrido;
        return texto;
    } 
    
    
}
