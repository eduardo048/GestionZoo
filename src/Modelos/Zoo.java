
package Modelos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Zoo  implements Serializable {
    private String nombreZoo;
    private int superficie;
    private String ciudad;
    private ArrayList<Animal> animales;
    private ArrayList<Habitat> habitats;
    private ArrayList<Personal> personal;
    private ArrayList<Visitas> visitas;
    
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
        this.personal = new ArrayList<Personal>();
        this.visitas = new ArrayList<Visitas>();
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

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public ArrayList<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(ArrayList<Habitat> habitats) {
        this.habitats = habitats;
    }

    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }

    public ArrayList<Visitas> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visitas> visitas) {
        this.visitas = visitas;
    }
    
    
    
    
    

    @Override
    public String toString() {
        String texto= "DATOS DEL ZOO: \n" +
               "Nombre Zoo: " + this.nombreZoo + "\n" +
               "Superficie del Zoo: " + this.superficie + " m" + "\n" +
               "Ciudad del zoo: " + this.ciudad + "\n";
        
        texto += this.animales.toString();
        texto += this.habitats.toString();
        texto += this.personal.toString();
        texto += this.visitas.toString();
        return texto;
    }
    
    
    //TODO SOBRE LOS ANIMALES
    
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
   
    
    //TODO SOBRE LOS HABITAT
    
    //Añadir un habitat
    public void añadirHabitat(Habitat nuevo){
        this.habitats.add(nuevo);
    }
    
    //Buscar habitat
    public Habitat buscarHabitat(String nombreHabitat){
        Habitat buscado=null;
        for(Habitat habitat : this.habitats){
            if(habitat.getNombre().equalsIgnoreCase(nombreHabitat)){
                buscado=habitat;
            }
        }
        return buscado;
    }
    
    //Eliminar habitat
    public void eliminarHabitat(String nombreHabitat){
        for(int i=0; i<habitats.size(); i++){
            if(habitats.get(i).getNombre().equalsIgnoreCase(nombreHabitat)){
                habitats.remove(i);
                return;
            }
        }
    }
 
    
    //TODO SOBRE EL PERSONAL 
    
    //Añadir personal
    public void añadirPersonal(Personal nuevo){
        this.personal.add(nuevo);
    }
    
    //Buscar Personal
    public Personal buscarPersonal(String nombrePersona){
        Personal buscado=null;
        for(Personal personal : this.personal){
            if(personal.getNombre().equalsIgnoreCase(nombrePersona)){
                buscado = personal;
            }
        }
        return buscado;
    }
    
    //Eliminar personal
    public void eliminarPersonal(String nombrePersona){
        for(int i=0; i<personal.size(); i++){
            if(personal.get(i).getNombre().equalsIgnoreCase(nombrePersona)){
                personal.remove(i);
                return;            
            }          
        }
    }
    
    //Buscar solo Cuidadores
    public ArrayList<Cuidador> getCuidadores(){
        ArrayList<Cuidador> cuidadores = new ArrayList<>();
        for(int i=0; i<personal.size(); i++){
            Personal per = personal.get(i);
            if(per instanceof Cuidador){
                cuidadores.add((Cuidador) per);
            }
        }
        return cuidadores;
    }
    
    
    //TODO SOBRE LAS VISITAS
    
    //Añadir una visita
    public void añadirVisita(Visitas nueva){
        this.visitas.add(nueva);
    }
    
    //Buscar Visita
    public Visitas buscarVisita(LocalDate fecha ){
        Visitas buscado=null;
        for(Visitas visita : this.visitas){
            if(visita.getFecha().equals(fecha)){
                buscado = visita;
            }
        }
        return buscado;
    }
    
    //Eliminar visita
    public void eliminarVisita(LocalDate fecha){
        for(int i=0; i<visitas.size(); i++){
            if(visitas.get(i).getFecha().equals(fecha)){
                visitas.remove(i);
                return;
            }
        }
    }
    
    //Filtrar visitas entre dos rangos de fecha 
    public ArrayList<Visitas> buscarVisitasEntre(LocalDate fechaInicio, LocalDate fechaFin){
        ArrayList<Visitas> resultado = new ArrayList<>();
        
        for(int i=0; i<this.visitas.size(); i++){
            Visitas visita = this.visitas.get(i);
            LocalDate fecha = visita.getFecha();
            if((fecha.isEqual(fechaInicio) || fecha.isAfter(fechaInicio)) && (fecha.isEqual(fechaFin) || fecha.isBefore(fechaFin))){
                resultado.add(visita);
            }
        }
        return resultado;
    }
    
    
    //OTRAS GESTIONES
    
    //Filtrar por especie
    public ArrayList<Animal> filtrarPorEspecieAnimal(String especie){
        ArrayList<Animal> resultado = new ArrayList<>();
        
        for(Animal animal : this.animales){
            if(animal.getEspecie().equalsIgnoreCase(especie)){
                resultado.add(animal);
            }
        }
        return resultado;
    }
    
    //Filtrar por edad
    public ArrayList<Animal> filtrarPorEdadAnimal(int edad){
        ArrayList<Animal> resultado = new ArrayList<>();
        
        for(Animal animal : this.animales){
            if(animal.getEdad() == edad){
                resultado.add(animal);
            }
        }
        return resultado;
    }
    
    //Filtrar por habitat
    public ArrayList<Animal> filtrarPorHabitat(String habitat){
        ArrayList<Animal> resultado = new ArrayList<>();
        
        for(int i=0; i< this.animales.size(); i++){
            Animal animal = this.animales.get(i);
            
            if(animal.getHabitat().getNombre().equalsIgnoreCase(habitat)){
                resultado.add(animal);
            }
        }
        return resultado;    
    }
    
    //Contar el numero de animales
    public int contarAnimales(){
        return this.animales.size();
    }
    
    //Contar especies de animales
    public int contarEspecies(){
        ArrayList<String> especies = new ArrayList<>();
        
        for(int i=0; i<this.animales.size(); i++){
            Animal animal = this.animales.get(i);
            String especie = animal.getEspecie();
            
            if(!especies.contains(especie)){
                especies.add(especie);
            }
        }
        return especies.size();
    }
    
    //Contar VisitasPorMes
    public int contarVisitasPorMes(int mes){
        int contador = 0;
        
        for(int i=0; i<this.visitas.size(); i++){
            Visitas visita = this.visitas.get(i);
            int mesVisita = visita.getFecha().getMonthValue();
            
            if(mesVisita == mes){
                contador++;
            }
        }
        return contador;
    }
    
    //Informacion por defecto
    public void cargarDatosPorDefecto() {
        // ====== ANIMALES ======
        Animal leon = new Animal("Simba", "León", 8, "Carnívoro", "tigre.jpg");
        Animal elefante = new Animal("Dumbo", "Elefante", 15, "Herbívoro", "jirafa.jpg");
        Animal mono = new Animal("Chita", "Mono", 5, "Omnívoro", "mono.jpg");

        this.anadirAnimal(leon);
        this.anadirAnimal(elefante);
        this.anadirAnimal(mono);

        // ====== HABITATS ======
        Habitat sabana = new Habitat("Sabana Africana", "Cálido", 1000, 5, 0);
        Habitat jungla = new Habitat("Jungla Tropical", "Húmedo", 800, 4, 0);

        this.añadirHabitat(sabana);
        this.añadirHabitat(jungla);

        // Asignar hábitats
        leon.setHabitat(sabana);
        elefante.setHabitat(sabana);
        mono.setHabitat(jungla);

        sabana.setNumeroAnimales(2);
        jungla.setNumeroAnimales(1);

        // ====== PERSONAL ======
        Administrativo admin = new Administrativo("Laura", "Mañana", 1800, "Contabilidad");
        Cuidador cuidador = new Cuidador("Pedro", "Tarde", 2000, 5);
        Guia guia = new Guia("Carlos", "Mañana", 1900, "Inglés");
        Limpiador limpiador = new Limpiador("Sonia", "Noche", 1600, "Zonas húmedas");

        this.añadirPersonal(admin);
        this.añadirPersonal(cuidador);
        this.añadirPersonal(guia);
        this.añadirPersonal(limpiador);

        // Asignar cuidador a los animales
        leon.setCuidador(cuidador);
        elefante.setCuidador(cuidador);
        mono.setCuidador(cuidador);

        // ====== VISITAS ======
        Visitas visita1 = new Visitas(LocalDate.of(2024, 5, 1), 30, guia, "Recorrido por la sabana");
        Visitas visita2 = new Visitas(LocalDate.of(2024, 6, 15), 20, guia, "Exploración de la jungla");

        this.añadirVisita(visita1);
        this.añadirVisita(visita2);
    }

   
}
