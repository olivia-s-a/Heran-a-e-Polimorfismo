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
public class Normal extends Ingresso {
    private int posicao;

 public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(30) + 1;
        this.posicao= valor;
        
    }

    

    @Override
    public String toString() {
        return "Ingresso Plateia{\n Comprador: " + this.getNomeConsumidor()+ "\n Preço: R$" + this.getPreco()+ "\n Posição: P" + this.getPosicao()+ '}';
    }
    
    
}
