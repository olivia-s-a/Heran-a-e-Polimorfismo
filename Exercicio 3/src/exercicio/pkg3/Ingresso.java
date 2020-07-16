/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;

/**
 *
 * @author olivi
 */
public class Ingresso {
    private String nomeConsumidor;
    private double preco;

    public String getNomeConsumidor() {
        return nomeConsumidor;
    }

    public void setNomeConsumidor(String nomeConsumidor) {
        this.nomeConsumidor = nomeConsumidor;
    }

    public double getPreco() {
        return preco;
    }

    public double imprimeValor(double preco) {
        this.preco = 45.00;
       return preco;
    }
    
}
