
package Modelos;

import java.io.Serializable;
import java.util.ArrayList;

public class Zoo  implements Serializable {
    private String nombreZoo;
    private int superficie;
    private String ciudad;
    private ArrayList<Animal> animales;
    private ArrayList<Habitat> habitats;
    
    //Constructor vacio
    public Zoo() {
    }
    
    //Constructor con atributos
    public Zoo(String nombreZoo, int superficie, String ciudad) {
        this.nombreZoo = nombreZoo;
        this.superficie = superficie;
        this.ciudad = ciudad;
        this.animales=new ArrayList<Animal>();
        this.habitats = new ArrayList<Habitat>();
    }
    
    //Setters and Getters
    public String getNombreZoo() {
        return nombreZoo;
    }

    public void setNombreZoo(String nombreZoo) {
        this.nombreZoo = nombreZoo;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        String texto= "DATOS DEL ZOO: \n" +
               "Nombre Zoo: " + this.nombreZoo + "\n" +
               "Superficie del Zoo: " + this.superficie + " m" + "\n" +
               "Ciudad del zoo: " + this.ciudad + "\n";
        
        texto += this.animales.toString();
        return texto;
    }
    
    
    //Todo sobre los animales
    
    //Crear un animal
    public void anadirAnimal(Animal nuevo){
        this.animales.add(nuevo);
    }
    
    //Buscar Animal
    public Animal buscarAnimal(String nombreAnimal){
        Animal buscado=null;
        for(Animal animal : this.animales){
            if(animal.getNombreAnimal().equalsIgnoreCase(nombreAnimal)){
                buscado=animal; 
            }
        }
        return buscado;  
    } 

    //Eliminar un animal
    public void eliminarAnimal(String nombreAnimal){  
        for(int i=0; i<animales.size(); i++){
            if(animales.get(i).getNombreAnimal().equalsIgnoreCase(nombreAnimal)){
                animales.remove(i);
                return;
            }
        }
    }
    
    //Todo sobre los habitat
    
    //Añadir un habitat
    public void añadirHabitat(Habitat nuevo){
        this.habitats.add(nuevo);
    }
    
    //Buscar habitat
    public Habitat buscarHabitat(String nombreHabitat){
        Habitat buscado=null;
        for(Habitat habitat : this.habitats){
            if(habitat.getNombre().equalsIgnoreCase(nombreZoo)){
                buscado=habitat;
            }
        }
        return buscado;
    }
    
    //Eliminar habitat
    public void eliminarHabitat(String nombreHabitat){
        for(int i=0; i<habitats.size(); i++){
            if(habitats.get(i).getNombre().equalsIgnoreCase(nombreZoo)){
                habitats.remove(i);
                return;
            }
        }
    }
    
    
    
    
    
}
