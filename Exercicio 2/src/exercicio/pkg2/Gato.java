/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

/**
 *
 * @author olivi
 */
public class Gato extends Animal{
  public boolean miar;

    public boolean isMiar() {
        return miar;
    }

    public void setMiar(boolean miar) {
        this.miar = miar;
    }
    
    public boolean miando(boolean miar, String nome){
        miar=true;
            System.out.println(nome + " está miando");
        return miar;
    }
    
    public boolean pararMiando(boolean miar, String nome){
        miar=false;
            System.out.println(nome + " parou de miar");
        return miar;
    }
    
}
