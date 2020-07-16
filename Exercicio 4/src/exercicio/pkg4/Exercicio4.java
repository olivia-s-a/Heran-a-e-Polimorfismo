/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author olivi
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner borracha = new Scanner (System.in);
      
        System.out.println("Bem vindo ao Imóveis Kiddie e Napi.\n Antes de tudo precisamos saber suas preferências"+
                "Digite [1] se preferir imóveis NOVOS e [2] se preferir VELHOS");
        
        int sushi = borracha.nextInt();
        
        switch (sushi){
            case 1:
                
                Novo j= new Novo();
                
                j.setEndereco(j.getEndereco());
                j.setPreco(j.getPreco());
                
               
                
                System.out.println(j.toString());
                
                break;
                
            case 2:
                 Velho l= new Velho();
                
                l.setEndereco(l.getEndereco());
                l.setPreco(l.getPreco());
                
                System.out.println(l.toString());
                
                break;
                
            default:
                System.out.println("Digite um dos valores válidos");
                break;
        }
        
    }
    
}
