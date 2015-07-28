/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;
//heredando la clase Thread
public class PrimerThread extends Thread{
    
    public void run(){
        while(true){
        try{
            Thread.sleep(1000); 
        System.out.println("YO SOY EL PRIMER THREAD");
        }catch(InterruptedException e){ //lanzas excepciones cuando se va a terminar el progra repentinamente
            
        }
    }//se cierra el while
  }
}