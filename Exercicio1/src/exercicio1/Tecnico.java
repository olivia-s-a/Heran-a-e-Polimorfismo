/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author olivi
 */
public class Tecnico extends Assistente{
    public double bonusSalario;

    public double getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(float bonusSalario) {
        this.bonusSalario = bonusSalario;
    }
    
    public double salarioBonus (double bonusSalario, double salario){
       System.out.println("(Este técnico recebe um bônus de " + this.bonusSalario + "%)");
        double salarioBonus;
        salarioBonus= this.salario+(this.bonusSalario*this.salario/100); 
        return salarioBonus;      
    }

    @Override
    public String toString() {
        return "Tecnico\n" + "Número de Matrícula= " + numMatricula + "\n Nome= " + this.getNome() 
                + "\n  Salário= " + this.salarioBonus(bonusSalario, salario);
    }
}
