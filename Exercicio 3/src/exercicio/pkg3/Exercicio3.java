/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author olivi
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*Normal n1= new Normal();
         CamaroteInferior i= new CamaroteInferior();
        
    n1.setNomeConsumidor("Luka");
    n1.setPosicao(n1.getPosicao());
    n1.imprimeValor(n1.getPreco());
     System.out.println(n1.toString());
    
        System.out.println("__________________\n");
        
    i.setNomeConsumidor("Ivete");
    i.setPosicaoI(i.getPosicaoI());
    i.imprimeValor(i.getPreco());
    i.adicional(i.getPreco());
        System.out.println(i.toString());
    
     System.out.println("__________________\n");
     
     CamaroteSuperior rote = new CamaroteSuperior();
     
     rote.setNomeConsumidor("Nati");
     rote.getPosicaoS();
     rote.imprimeValor(rote.getPreco());
     rote.adicional2(rote.adicional(rote.getPreco()));
     rote.getPreco();
     System.out.println(rote.toString());*/
        
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Olá! Qual seu nome?");        
        
       String nome = dados.nextLine();
        
        System.out.println("Digite [1] para Ingresso normal e [2] para VIP");
        
        Scanner num1 = new Scanner (System.in);
        
        int ingresso = num1.nextInt();
        
      switch (ingresso){
          case 1:
              Normal n1= new Normal();
              
              n1.setNomeConsumidor(nome);
              n1.setPosicao(n1.getPosicao());
              n1.imprimeValor(n1.getPreco());
              System.out.println(n1.toString());
              
              break;
          case 2:
              Scanner dados2 = new Scanner (System.in);
               System.out.println("Digite [1] para Camarote SUPERIOR e [2] para Camarote INFERIOR");
               
              int camarote = dados2.nextInt();
              
              switch (camarote){
                  case 1:
                      CamaroteSuperior rote = new CamaroteSuperior();
     
                        rote.setNomeConsumidor(nome);
                        rote.getPosicaoS();
                        rote.imprimeValor(rote.getPreco());
                        rote.adicional2(rote.adicional(rote.getPreco()));
                        rote.getPreco();
                        System.out.println(rote.toString());
                      
                      break;
                  case 2:
                      CamaroteInferior i= new CamaroteInferior();
                      
                      i.setNomeConsumidor(nome);
                        i.setPosicaoI(i.getPosicaoI());
                        i.imprimeValor(i.getPreco());
                        i.adicional(i.getPreco());
                            System.out.println(i.toString());
                      
                      break;
                  default:
                       System.out.println("O valor não foi entendido");
                       break;
                      
                      
              }
                      
                      
              
              break;
          default:
              System.out.println("O valor não foi entendido");
              break;
      }
     
     
 
        
    
    }
    
   
    
   
}
