/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.Calendar;

public class ThreadPolimorfico implements Runnable{

    public static void main(String[] args) {
        Runnable r=new ThreadPolimorfico();
        Thread t1=new Thread(r); //es plomorfico xq va a tener caracteristicas de r y threadPoli
        t1.start();
    }
    @Override
    public void run() {
        while(true){
        try{
            Thread.sleep(1000);
            //vamos a crear un relojito chafa
            Calendar cal=Calendar.getInstance();
            int hora=cal.get(Calendar.HOUR);
            int minutos=cal.get(Calendar.MINUTE);
            int segundos=cal.get(Calendar.SECOND);
            System.out.println(hora+":"+minutos+":"+segundos);   
            
        }catch(Exception e){
            
        }
    }
  }
}