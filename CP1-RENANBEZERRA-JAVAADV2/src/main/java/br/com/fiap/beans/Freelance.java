package br.com.fiap.beans;

import br.com.fiap.anotation.Tabela;

import java.util.Date;
@Tabela(nome = "TAB_FREELANCE")
public class Freelance extends Funcionario {
    public Freelance(String nome, Date horasDate, int horas, double valorPagoHoras) {
        super(nome, horas, valorPagoHoras);
    }

    @Override
    public double calcularSalario(int horas, double valorPagoHoras) {
        /*salario de um funcionario porém com a soma do valor das horas vezes 2*/
        double salario = ( horas * valorPagoHoras + (2*horas) );
        return 0;
    }
    @Override
    public String mostrarInformacoes(Funcionario f){
        return f.getNome() + " suas horas trabalhadas é de: "
                + f.getHoras() + " sendo o valor por hora " + f.getValorPagoHoras() +
                " resultando no seu salario de :" + ((f.getHoras() * f.getValorPagoHoras()) + calcularSalario(f.horas, f.valorPagoHoras) + " e você é freelance");
    }
}
