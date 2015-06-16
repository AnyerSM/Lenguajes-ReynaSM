/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkedexceptions;

/**
 *
 * @author T-107
 */

import java.io.*; //palabra reservada sirve para importar
import java.util.logging.Level;
import java.util.logging.Logger;
// asi con *; puedes usar todas cualquiera las clases q estan ese paquete

        public class ProbarChecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        //crear un archivo q salga de la compu y se guarde en una carpeta
   File f=new File("archivaldo"); 
      //  try {
            FileOutputStream fos=new FileOutputStream(f); //este podria olanzar varias excepciones es una checkedexcpecion
           ObjectOutputStream cos=new ObjectOutputStream(fos);
       /*    
            //bloque catch y la palabra throwable
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {  
           
        }catch(Exception ex){ //siempre esta de respaldo la mama si existe una excepcion muy grande y solo la soluciona ella
//la mama solo va de respaldo pero primero sus hijasla mama es de emergencia no para resolver todos los problemas
    }*/
    //TRY - CATCH DETIENE Y PUEDE COMUNICAR 
           //PERO EL THROWS SDETIENE ABRUPTAMENTE NO VA DENTRO DEL MAIN NUNCA SOLO VA EN LA CONSTRUCCION

    }
        }
