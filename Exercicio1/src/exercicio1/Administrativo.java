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
public class Administrativo extends Assistente {
    public String turno;

    public String isTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public double bonusOuPas(String turno, double salario){
        double salarioFinal=this.salario;
        int contador=0;
        
        while (contador==0){
            if (turno == "NOTURNO"){
                System.out.println("(Este assistente trabalha no turno noturno)");
                salarioFinal=(this.salario*0.5)+this.salario;
                contador = 1;                
                
            }
            else if(turno=="DIURNO"){
                System.out.println("(Este assistente trabalha no turno diurno)");
                salarioFinal=this.salario;
                contador = 1;
                
            }
            else{
                System.out.println("NÃO foi possível ENTENDER o valor INSERIDO");
                
            }
        }
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Administrativo\n" + "Número de Matrícula= " + numMatricula + "\n Nome= " + this.getNome() 
                + "\n  Salário= " + this.bonusOuPas(turno, salario);
    }
    
    
}
