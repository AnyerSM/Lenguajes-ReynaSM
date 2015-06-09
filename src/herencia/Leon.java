/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Leon extends Animal implements ComportamientoRuido{

    @Override //anotacion sobreescritura implentando el metodo hacer ruido igualito 
            //PERFECTAMENTE LA VERSION DE LA INTERFACE ruido metodo
    public String hacerRuido() {
         return "warrrrrr";
    }
}
