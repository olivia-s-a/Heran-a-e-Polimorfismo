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
public class Cachorro extends Animal {
    public boolean latir;

    public boolean isLatir() {
        return latir;
    }

    public void setLatir(boolean latir) {
        this.latir = latir;
    }
    
    public boolean latindo(boolean latir, String nome){
        latir=true;
       System.out.println(nome + " está latindo");
        return latir;
    }
    public boolean pararLatindo(boolean latir, String nome){
        latir=false;
        System.out.println(nome + " não está latindo");
              return latir;
              
    }
    
}
