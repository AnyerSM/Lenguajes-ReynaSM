/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.List;

public class GeneradorDeUsuarios {
  
    private List<Usuario> usuarios; //listas genericas, solo se agregan objetos de tipo usuario

    public GeneradorDeUsuarios(){
    Usuario u1=new Usuario("juan", 42, "jc@gmail.com");
    Usuario u2=new Usuario("Ana", 22, "ana@outlook.com");
    Usuario u3=new Usuario("Pedro", 33, "peter@yahoo.com");
    
    usuarios=new ArrayList<Usuario>();
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }    
}