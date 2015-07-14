/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;

public class ProbarArreglos {
    public static void main(String[] args){
        GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();//constructor new //se invoca el constructor
 generadora.agregarUsuario("Antonio",18,"ant@hotmail.com");
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>)generadora.getUsuarios(); //polimorfismo
       System.out.println(usuarios.size());
   for(Usuario u:usuarios){
       System.out.println(u.getNombre() + "edad: "+ u.getEdad() + "email: "+ u.getEmail());
   }  
    }
}