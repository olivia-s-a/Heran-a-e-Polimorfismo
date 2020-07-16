/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

import java.util.Random;

/**
 *
 * @author olivi
 */
public class Imovel {
    
    private String endereco;
    private double preco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        
        this.endereco = endereco;
        //número da rua
        Random numero = new Random();
        int rua = numero.nextInt(1000) + 1;
        String adoramos = "Rua "+ rua;
        this.endereco= adoramos;
       
       
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
       Random precalet = new Random();
        int precalor = precalet.nextInt(10000) + 1000;
        this.preco=precalor;
        
        
    }
    
    
}
