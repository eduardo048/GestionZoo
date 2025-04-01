//Excepecion si un animal no tiene un cuidador

package Modelos;

import java.io.Serializable;

public class AnimalSinCuidadorExcepcion extends Exception implements Serializable{
    
    public AnimalSinCuidadorExcepcion(String mesage) {
        super(mesage);
    }
}
