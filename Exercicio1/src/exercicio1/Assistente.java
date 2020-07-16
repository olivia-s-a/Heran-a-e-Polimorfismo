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
public class Assistente extends Funcionario {
    
  public int numMatricula;

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

            
    @Override
    public String toString() {
        return "Assistente\n" + "Número de Matrícula= " + numMatricula + "\n Nome= " + this.getNome() 
                + "\n  Salário= " + this.getSalario();
    }
  
    
}
