/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacionrepaso;

public class Antro {

    public static void main(String[] args) {
        // TODO code application logic here
   
    // Direccion d1=new Direccion(55130,"Ecatepec"); 
       Usuario u=new Usuario("Juan",42,"jcampos@gmail.com",new Direccion(55130,"Ecatepec"));
        System.out.println(u.getDireccion().getMunicipio()); 
//invocacion de metodos por cadena preimero get direccion por la clase y municipio que es lo
//q se necesita como escalonsubir sin saltar sino uno por uno
    }
}