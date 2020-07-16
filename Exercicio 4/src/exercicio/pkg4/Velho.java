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
public class Velho extends Imovel{
    
    public double desconto (double preco){
        double menos;
        menos = this.getPreco()-(this.getPreco()*0.50);
        return menos;
    } 

    @Override
    public String toString() {
        //LEMBRE DE SETAR O PREÇO E O ENDEREÇO!
        return "Informações do Imóvel{\n VELHO \n Endereço: " + this.getEndereco()+ "\n Preço: R$ " + this.desconto(this.getPreco())+'}';
    }
    
}
