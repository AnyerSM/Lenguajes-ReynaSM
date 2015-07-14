/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDeUsuarios {
  
    private List<Usuario> usuarios; //listas genericas, solo se agregan objetos de tipo usuario //crea atributo de tipo list

    public GeneradorDeUsuarios(){
    Usuario u1=new Usuario("Juan", 42, "jc@gmail.com");
    Usuario u2=new Usuario("Ana", 22, "ana@outlook.com");
    Usuario u3=new Usuario("Pedro", 33, "peter@yahoo.com");
    Usuario u4=new Usuario("Pancha", 60, "pancha@hotmail.com");
    
    usuarios=new ArrayList<Usuario>(); //hijo de list arraylist //inicailizado
    usuarios.add(u1);//llenado
    usuarios.add(u2);//llenado
    usuarios.add(u3);//llenado
    usuarios.add(u4);
    
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }    
    public String agregarUsuario(String nombre, int edad, String email){
        Usuario u=new Usuario(nombre, edad, email);
    usuarios.add(u);
    return"Usuario agregado con exito ";
    }
}