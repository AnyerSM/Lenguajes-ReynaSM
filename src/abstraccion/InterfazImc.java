/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
   public static void main(String oso[]){
    Imc imc=new Imc(80, 1.67f);
    //con este se crea un objeto 
    
    System.out.println(    imc.calcular());
    System.out.println(imc.getPeso());
    //primitivos integrales
           
    byte b=2; //es el tipo de dato mas chico y es el mas importante
    // porque es la unidad de transferencia basica en internet 
    short s=2;  //
    int i=2;  //
    long l=2;  //
    //arreglos de bytes serializacion (meter en arreglos) compresion y descompresion ------ se leen de derecha izq
    b=(byte)s;
    s=b;
    i=(int)l;
    i=s;
    s=(short)i; //hacer promocion forzada xq no cabe
//promocion derecta o casting directo
   float f=2.0f; //asi se reconoce como flotante
   double d=2.0;
    boolean valor=false; //el de defecto es el false
    
    //los contructores incializan los valores x defecto de cada valor
   Imc otro=new Imc();
   otro.setFlaco(true);
   System.out.println(otro.isFlaco());
   } 
}
