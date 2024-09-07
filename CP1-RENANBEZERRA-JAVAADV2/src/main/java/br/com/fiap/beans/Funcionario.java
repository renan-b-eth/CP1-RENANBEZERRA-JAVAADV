package br.com.fiap.beans;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.anotation.Tabela;

@Tabela(nome = "TAB_FUNCIONARIO")
public abstract class Funcionario {
    @Coluna(nome = "cl_nome", tamanho = 100, obrigatorio = true)
    String nome;
    @Coluna(nome = "cl_horas", tamanho = 50, obrigatorio = true)
    int horas;
    @Coluna(nome = "cl_valorPago", tamanho = 100, obrigatorio = true)
    double valorPagoHoras;



    //public Funcionario(String nome, int horas, double valorPagoHoras) {
    //}
    //construtor
    public Funcionario(String nome, int horas, double valorPagoHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorPagoHoras = valorPagoHoras;
    }

    //getters
    public String getNome() {
        return nome;
    }


    public int getHoras() {
        return horas;
    }

    public double getValorPagoHoras() {
        return valorPagoHoras;
    }

    //setters
    public void setValorPagoHoras(double valorPagoHoras) {
        this.valorPagoHoras = valorPagoHoras;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    /*Metodos que foram pedidos*/
    public double salarioFinal(int horas, double valorPagoHoras){
        double salario = horas * valorPagoHoras;
        return salario;
    }

    public abstract double calcularSalario(int horas, double valorPagoHoras);

    public String mostrarInformacoes(Funcionario f){
        return f.getNome() + " suas horas trabalhadas é de: "
                + f.getHoras() + " sendo o valor por hora " + f.getValorPagoHoras() +
                " resultando no seu salario de :" + (f.getHoras() * f.getValorPagoHoras());
    }


}
