/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;

import java.util.Random;

/**
 *
 * @author olivi
 */
public class CamaroteSuperior extends VIP{

    private int posicaoS;

    public int getPosicaoS() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(10) + 1;
        this.posicaoS= valor;
        return posicaoS;
    }
    
    public double adicional2 (double npreco){
        double n2Preco;
        n2Preco= npreco +(npreco*0.25);
        return n2Preco;
    }

    @Override
    public String toString() {
        return "Ingresso VIP Camarote Superior{ \n Comprador: " + this.getNomeConsumidor()+ "\n Preço: R$" + this.adicional2(this.adicional(this.getPreco()))  + "\n Posição: S" + this.getPosicaoS()+ '}';
    }
    
}
