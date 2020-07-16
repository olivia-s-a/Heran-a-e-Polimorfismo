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
public class Animal {
  private String nome;
  private String raca;
  public boolean caminho;

    public boolean isCaminho() {
        return caminho;
    }

    public void setCaminho(boolean caminho) {
        if (true){
        this.caminho = this.caminhar(caminho, nome);
        }
        else{
            this.caminho=this.pararCaminhar();
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
  
  public boolean caminhar(boolean caminho, String nome){
      caminho=true;
      System.out.println(nome + " está caminhando");
      return caminho;
  }
    
  public boolean pararCaminhar(){
      caminho = false;
      System.out.println ( nome + " parou de caminhar");
      this.caminho = caminho;
      
      return caminho;
  }
    
}
