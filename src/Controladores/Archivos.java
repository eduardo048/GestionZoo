//Clase para realizar todas las operaciones con archivos
package Controladores;

import Modelos.Animal;
import Modelos.Zoo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTextArea;


public class Archivos {
    //Constructor
    public Archivos() {
    }
    
    
    //Metodo para guardar el archivo binario que contiene todo el objeto zoo
    public void guardarZoo(File fichero, Zoo zoo) throws FileNotFoundException, IOException{
        
        if(!fichero.exists()){
            fichero.createNewFile();
        }
        
        FileOutputStream fos = new FileOutputStream(fichero);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(zoo);
        
        oos.close();
        fos.close();
    }
    
    //Metodo para leer el zoo 
    public Zoo leerZoo(File elegido) throws FileNotFoundException, IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream(elegido);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Zoo unZoo=(Zoo) ois.readObject();
        
        fis.close();
        ois.close();
        
        return unZoo;
    }
    
    //Metodo para guardar los nombres de los animales y los nombres de sus cuidadores
    public void guardarAnimalCuidador(File fichero, Zoo zoo) throws IOException{
        
        if(!fichero.exists()){
            fichero.createNewFile();
        }
        
        
        BufferedWriter  bw = new BufferedWriter (new FileWriter(fichero));
        ArrayList<Animal> animales = zoo.getAnimales();
        
        for(Animal ani : animales){
            String nombre = ani.getNombreAnimal();
            String cuidador = "sin asignar";
            if(ani.getCuidador() != null){
                cuidador = ani.getCuidador().getNombre();
            }
            bw.write(nombre + "- Cuidador: " + cuidador);
            bw.newLine();
        }
        bw.close();
         
    }
    
    //Metodo para mostrar el animal y el cuidador 
    public void mostrarAnimalCuidador(File fichero, JTextArea areaTexto) throws FileNotFoundException, IOException{
        if(!fichero.exists()){
            areaTexto.setText("El archivo no existe");
        }
        
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        
        String linea;
        StringBuilder contenido = new StringBuilder();
        
        while((linea = br.readLine()) != null){
            contenido.append(linea).append("\n");
        }
        
        br.close();
        fr.close();
        
        areaTexto.setText(contenido.toString());
        
    }
  
}
