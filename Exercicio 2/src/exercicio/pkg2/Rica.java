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
public class Rica extends Pessoas {
    
    private double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public double fazCompras(double dinheiro, String nome){
        if (dinheiro>0){
            System.out.println(nome + " está fazendo compras");
            this.dinheiro=dinheiro-1;
        }
        else {
            System.out.println("Essa pessoa não tem mais dinheiro para fazer compras...");
        }
        return dinheiro;
    }    
}
