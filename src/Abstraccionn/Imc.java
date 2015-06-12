/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccionn;

/**
 *
 * @author T-107
 */
public class Imc {
  private float peso;
  private float altura;
  private boolean flaco;
  public void setFlaco(boolean flaco){
      this.flaco=flaco;
        }
    Imc(int i, float f) {
    }
    public boolean isFlaco(){ //en booleano get es "is" x convencion xq solo tienes dos valores
        return flaco;  
    }
  
   public void setPeso(float peso) {
        this.peso=peso;
    }

    public void setAltura(float altura)  {
        this.altura=altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    public Imc(){
//constructor por defecto
  }

    float calcular() {
      return 0;
    }
}
