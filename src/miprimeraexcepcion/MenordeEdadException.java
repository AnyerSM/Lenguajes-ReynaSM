/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;


//interrupcion de un programa en una ejecucion
//excepiones son para validar datos

public class MenordeEdadException extends Exception { //ya es una excepcioncon extends Exception
    public MenordeEdadException(){  //declaracion del constructor
//en las clases los construtores no se heredan se invocan con una  palabra super
        super("eres un chamaco no te puedo registrar le voy a decir a tu mama!!!");
        
    }
}
