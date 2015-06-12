/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenciaa;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Animal raro=new Animal();
               raro.setEdad(2);
               raro.setNombre("Rareza"); */
        //no debe crearse objetos de ella con la clase abstract y solo debe ser heredada
/*
        Tortuga animal1=new Tortuga();
               animal1.setNombre("Japonesa");
               animal1.setEdad(12);
       Leon animal2=new Leon();
               animal2.setNombre("Africano");
               animal2.setEdad(20); 
*/
     
//vamos a crear animalitos
  Pollo p1=new Pollo();
  p1.setNombre("POLLITO PIO");
  
  Leon l1=new Leon();
  l1.setNombre("SIMBA");
  
  Leon l2=new Leon();
  l2.setNombre("MU-FA-SA");
  
  Delfin d1=new Delfin();
  d1.setNombre("FLIPPER");
  
  Tortuga t1=new Tortuga();
  t1.setNombre("NINGA");
 
  /*
  int x[]=new int[5];
 for (int hacerRuido:x){ //variable entera y var local x va empezar a iterar 
            //y pone el primer elemento y luego se va increment va tomando el segundo valor q sigue
            //lenguaje expresivo una idea se puede poner muy facil en codigo 
            //x es un arreglo y se va a iterar y cada vez su valor se va a depositar en m
            System.out.println("Este elemento tiene un valor de: "+hacerRuido);
        } 
 */
  
  ComportamientoRuido animales[]=new ComportamientoRuido[4];
animales[0]=p1; 
//casting explicito para objetos de distintas clases
//herencias Padre unidos directamente
//polimorfismo tio algo los une y son distintos sobrinos de distintos padres
//de distinta familia siempre y cuando se ael ancestro de esta clase
animales[1]=l1;
animales[2]=l2;
animales[3]=d1;    

for(ComportamientoRuido algo: animales){
    algo.hacerRuido();
    System .out.println(algo.hacerRuido());
    
}
    
    }
}
