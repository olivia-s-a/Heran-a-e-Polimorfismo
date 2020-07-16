/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

/**
 *
 * @author olivi
 */
public class Novo extends Imovel {
    
    public double adicional (double preco){
        double mais;
        mais = (this.getPreco()*0.50)+ this.getPreco();
        return mais;
    } 

    @Override
    public String toString() {
        //LEMBRE DE SETAR O PREÇO E O ENDEREÇO!
        return "Informações do Imóvel{\n NOVO \n Endereço: " + this.getEndereco()+ "\n Preço: R$ " + this.adicional(this.getPreco())+'}';
    }
    
    
    
    
}
