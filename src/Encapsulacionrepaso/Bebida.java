/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacionrepaso;

public class Bebida {

    private String tipo;
    private String []bebida;
    
    public String[] obtenerRecomendaciones(){
    if(tipo.equals("alcoholicas")){ //si el codigo es = a alcoholicas--- equals compara contenidos de la clase
   String []alcohol={"cerveza sol","cerveza  indio","wisky","pulque","tonaya"};
    return alcohol;
    }else{
   String []sinalcohol={"agua","coca-cola","pepsi","agua mineral","red-bull"};   
return sinalcohol; 
}
}
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebida() {
        return bebida;
    }

    public void setBebida(String[] bebida) {
        this.bebida = bebida;
    }
}