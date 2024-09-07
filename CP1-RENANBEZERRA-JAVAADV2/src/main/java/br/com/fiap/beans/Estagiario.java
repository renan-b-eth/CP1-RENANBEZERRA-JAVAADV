package br.com.fiap.beans;

import br.com.fiap.anotation.Tabela;

import java.util.Date;
@Tabela(nome = "TAB_FUNCIONARIO")
public class Estagiario extends Funcionario {

    public Estagiario(String nome, Date horasDate, int horas, double valorPagoHoras) {
        super(nome, horas, valorPagoHoras);
    }

    @Override
    public double calcularSalario(int horas, double valorPagoHoras) {
        /*salario do estagiario é a metade*/
        double salario = ( (horas/2) * valorPagoHoras );
        return salario;
    }
    @Override
    public String mostrarInformacoes(Funcionario f){
        return f.getNome() + " suas horas trabalhadas é de: "
                + f.getHoras() + " sendo o valor por hora " + f.getValorPagoHoras() +
                " resultando no seu salario de :" + ((f.getHoras() * f.getValorPagoHoras()) + calcularSalario(f.horas, f.valorPagoHoras) + " e você é estagiario");
    }
}
