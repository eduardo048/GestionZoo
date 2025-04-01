
package Modelos;

import java.io.Serializable;

public class Animal implements Serializable {
    
    private String nombreAnimal;
    private String especie;
    private int edad;
    private String alimentacion;
    private String habitat;
    private String cuidador;
    private String imagen;
    
    //Constructor vacio
    public Animal() {
    }
    
    //Constructor con atributos 

    public Animal(String nombreAnimal, String especie, int edad, String alimentacion, String imagen) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.edad = edad;
        this.alimentacion = alimentacion;
        this.habitat="";
        this.cuidador="";
        this.imagen = imagen;
    }
    
    //Setter and Getter
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getCuidador() {
        return cuidador;
    }

    public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    //Mostras animales
    @Override
    public String toString() {
        String texto = nombreAnimal + 
                "\n Especie: " + especie + 
                "\n Edad: " + edad + " años" +
                "\n Alimentación: " + alimentacion + 
                "\n Hábitat: " + habitat +
                "\n Cuidador: " + cuidador;
        try{//excepcio sin cuidador un animal
            if(this.cuidador.isEmpty()){
                throw new AnimalSinCuidadorExcepcion("Peligo animal sin cuidado");
            }else{
                System.out.println("Cuidador: " + this.cuidador);
            }
        }catch(AnimalSinCuidadorExcepcion asce){
            texto += "\n Cuidador:" + asce.getMessage();
        }
        return texto;
    }  
}
