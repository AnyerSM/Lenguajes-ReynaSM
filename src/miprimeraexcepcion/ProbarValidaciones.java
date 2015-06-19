/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarValidaciones {

    public static void main(String[] args) {
        // TODO code application logic here
   int edad=20;
        System.out.println("VAMOS A VALIDAR TU EDAD");
        try {
            
            ValidarEdad.validar(edad);
            System.out.println("SI TU TE VEZ NO SE LANZO LA EXCEPCION");
            
        } catch (MenordeEdadException ex) {
            System.out.println(ex.getMessage());  
        } catch (NumberFormatException ex){
            System.out.println("METISTE LETRAS Y NO NUMEROS = TONTO");
        }
    
    }
    
}
