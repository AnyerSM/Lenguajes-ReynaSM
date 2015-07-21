/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class ModeloPersistenciaAnimal {
    public void guardar(Animal animal)throws Exception{
        //paso 1 crear el archivo donde se guardara el am¿nimal
        File file=new File("C:\\Users\\T101\\Documents\\animalitos.sss\\");//GenerasTusPropiasExtensionesYSoloLoPuedeLeerElPrograma
    FileOutputStream fos=new FileOutputStream(file); //encadenamiento por constructor
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(animal);
    System.out.println("Animalito comprimido con exito");
    }
}
