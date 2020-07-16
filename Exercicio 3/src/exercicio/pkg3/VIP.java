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
public class VIP extends Ingresso {
    public double adicional(double preco){
        double socorro;
        socorro=preco+(preco*25/100);
        return socorro;
      
        
       
    }
    
}
