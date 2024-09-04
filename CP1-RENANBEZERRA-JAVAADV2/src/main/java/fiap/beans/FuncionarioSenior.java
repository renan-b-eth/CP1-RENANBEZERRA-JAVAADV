
package fiap.beans;

import java.util.Date;
/*Heranca*/
public class FuncionarioSenior extends Funcionario {

    private double valorBonus;


    /*SobreEscrita*/
    @Override
    public double calcularSalario(int horas, double valorPagoHoras) {
        double salarioBase = super.salarioFinal(horas,valorPagoHoras);
        int bonus = (int) (horas / 10);
        return salarioBase + bonus * valorBonus;
    }
    @Override
    public String mostrarInformacoes(Funcionario f){
        return f.getNome() + " suas horas trabalhadas é de: "
                + f.getHoras() + " sendo o valor por hora " + f.getValorPagoHoras() +
                " resultando no seu salario com bonus é de :" + ((f.getHoras() * f.getValorPagoHoras()) + calcularSalario(f.horas, f.valorPagoHoras));
    }

    /*construtor*/
    public FuncionarioSenior(String nome, int horas, double valorPagoHoras) {
        super(nome, horas, valorPagoHoras);
    }
}
