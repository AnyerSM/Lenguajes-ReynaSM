/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    public static void main(String[] args) {
      
         int x[]={1,45,-12,7};
        int y[]=new int[3];
        y [0]=34;
        y[1]=12;
        y[2]=45;

        int z[]=new int[]{3,-12,9};
        //distintas maneras de inicializar arreglos
        String hola= "hola";
        
        for(int i=0; i<x.length; i++) {//length longitud del arreglo sin poner un numero establecido
        
            System.out.println("este elemento tiene un valor de: " +x[i]);
        }  
    for (int m:x){ //variable entera y var local x va empezar a iterar 
            //y pone el primer elemento y luego se va increment va tomando el segundo valor q sigue
            //lenguaje expresivo una idea se puede poner muy facil en codigo 
            //x es un arreglo y se va a iterar y cada vez su valor se va a depositar en m
            System.out.println("Este elemento tiene un valor de: "+m);
        }
    byte []algo= hola.getBytes();
 for(byte b:algo){
     System.out.println((char)b); //casting forzado para q muestre las letras y no solo el codigo de ascii
 }
//get byte 
 //
      String hello= "estoy muy aburrido";
   
 byte []some= hello.getBytes();
 for(byte b:some){
     System.out.println((char)b);  
 } //*/  
 
  String hey= "101";
/*+"115" +
"116" +
"111" +
"121" +
"32" +
"109" +
"117" +
"121" +
"32" +
"97" +
"98" +
"117" +
"114" +
"114" +
"105" +
"100" +
"111";*/
   
 byte []someone= hey.getBytes();
 for(byte b:someone){
     System.out.println((char)b);  
 }
 
 //###################################################################
 
 //sirve para construir strings en arreglos clase String builder
 StringBuilder builder=new StringBuilder();
 for(byte valor:algo){ //cada vuelta el valro de algo se va a depositar en la palabra valor
     builder.append((char)valor);
 }
// etiquetax.setText(builder.toString()); 
    
    }
    
}
