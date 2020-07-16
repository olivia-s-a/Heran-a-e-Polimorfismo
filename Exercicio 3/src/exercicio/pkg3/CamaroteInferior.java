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
public class CamaroteInferior extends VIP{
    private int posicaoI;

    public int getPosicaoI() {
        return posicaoI;
    }

    public void setPosicaoI(int posicaoI) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(15) + 1;
        this.posicaoI= valor;
        
    }

    @Override
    public String toString() {
        return "Ingresso VIP Camarote Inferior{ \n Comprador: " + this.getNomeConsumidor()+ "\n Preço: R$" + this.adicional(this.getPreco())  + "\n Posição: I" + this.getPosicaoI()+ '}';
    }
    
}
