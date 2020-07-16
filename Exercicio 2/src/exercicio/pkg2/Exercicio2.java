/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

/**
 *
 * @author olivi
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        
        Cachorro bent = new Cachorro();
        Gato capi = new Gato();
        
        
        bent.setNome("Bent");
        bent.setRaca("Pinscher");
        bent.caminhar(bent.caminho, bent.getNome());
        bent.latindo(bent.latir, bent.getNome());
        bent.pararCaminhar();
        
         System.out.println("\n");
         
        capi.setNome("Capi");
        capi.setRaca("Chartreux");
        capi.caminhar(true, capi.getNome());
        capi.miando(true, capi.getNome());
        capi.pararMiando(true, capi.getNome());
        
        System.out.println("_____________________________\n");
        
        Rica rita = new Rica();
        Pobre polly = new Pobre();
        Miseravel flameu = new Miseravel();
        Rica lilica = new Rica();
        
        rita.setNome("Rita");
        rita.setIdade(35);
        rita.setDinheiro(1);
        rita.fazCompras(rita.getDinheiro(),rita.getNome());
        rita.fazCompras(rita.getDinheiro(),rita.getNome());
        
         System.out.println("\n");
         
        polly.setNome("Polly");
        polly.setIdade(19);
        polly.trabalhando(polly.getNome());
        polly.pararTRabalhando(polly.getNome());
        
        System.out.println("\n");
         
        lilica.setNome("Lilica");
        lilica.setIdade(46);
        lilica.setDinheiro(100000);
        lilica.fazCompras(lilica.getDinheiro(), lilica.getNome());
        
        System.out.println("\n");
         
        flameu.setNome("Nicola");
        flameu.setIdade(67);
        flameu.mendigando(flameu.getNome());
        flameu.pararMendigar(flameu.getNome());
        
        
        
    }
    
}
