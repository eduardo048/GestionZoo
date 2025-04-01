//Clase para realizar todas las operaciones con archivos
package Controladores;

import Modelos.Zoo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


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
    
    public Zoo leerZoo(File elegido) throws FileNotFoundException, IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream(elegido);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Zoo unZoo=(Zoo) ois.readObject();
        
        fis.close();
        ois.close();
        
        return unZoo;
   
    }
  
}
