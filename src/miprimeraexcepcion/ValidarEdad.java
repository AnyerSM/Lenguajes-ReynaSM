/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;

public class ValidarEdad {
 //existen en los proyectos tres tipos de clases en JAVA
    //la primera es entidades----objeto definido con ciertas caracteristicas y elementos---pojo  objeto tipo excepcion-cuelquier objeto de tu app
    //clase model ----no se jecutan, contienen logica aplicada a entidades validan----contiene la excepcion---logica entre estos objetos
    //clase main ---son de ejecucion y tienen metodo main ---aqui trabajamos---normalmente se crean objetos de las entidades y de las model
    //dentro del main estan los objetos de entidades y model donde se splica la logica ---se crean los objetos de las anteriores
    
    //static se aplica a bloqs de codigo a clases y a metodos aqui aplicaremos a metodos---
    //static se rejfiere que para invocasr esa estructura no necesita invocar un objeto de la clase
    //lo q hace el compilador es apañar lo static es lo q se ejecuta primero
    //
    
    public static void validar(int edad)throws MenordeEdadException{
            //lanza esta en trecera persona, preparar para lanzar una excepcion 
                   if(edad<18)throw  new MenordeEdadException();
     
    }
    
    
}
