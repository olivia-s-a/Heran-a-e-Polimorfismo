/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author olivi
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administrativo adm1 = new Administrativo();
        Administrativo adm2=new Administrativo();
        Tecnico tec = new Tecnico();
        
        adm1.setNumMatricula(1223456789);
        adm1.setNome("Mirtes Josué de Sousa");
        adm1.setSalario(765.00);
        adm1.setTurno("DIURNO");
        
 
        System.out.println(adm1.toString());
        
        System.out.println("_______________________");
        
        adm2.setNumMatricula(1528415128);
        adm2.setNome("Genoveva Salmoura");
        adm2.setSalario(765.00);
        adm2.setTurno("NOTURNO");
        
        System.out.println(adm2.toString());
        
        System.out.println("_______________________");
        
         tec.setNumMatricula(852085322);
        tec.setNome("Reginalda Silva");
        tec.setSalario(765.00);
        tec.setBonusSalario(19);
        
        System.out.println(tec.toString());
        
    }
    
}
