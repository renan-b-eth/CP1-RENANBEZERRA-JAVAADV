package br.com.fiap.beans;

import java.util.Date;

public abstract class Funcionario {
    String nome;
    Date horasDate;
    int horas;
    double valorPagoHoras;

    public String getNome() {
        return nome;
    }

    public Date getHorasDate() {
        return horasDate;
    }

    public int getHoras() {
        return horas;
    }

    public double getValorPagoHoras() {
        return valorPagoHoras;
    }

    public void setValorPagoHoras(double valorPagoHoras) {
        this.valorPagoHoras = valorPagoHoras;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setHorasDate(Date horasDate) {
        this.horasDate = horasDate;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Date horasDate, int horas, double valorPagoHoras) {
        this.nome = nome;
        this.horasDate = horasDate;
        this.horas = horas;
        this.valorPagoHoras = valorPagoHoras;
    }
    /*Metodos que foram pedidos*/
    protected double salarioFinal(int horas, double valorPagoHoras){
        double salario = horas * valorPagoHoras;
        return salario;
    }

    public String mostrarInformacoes(Funcionario f){
        return f.getNome() + " suas horas trabalhadas é de: "
                + f.getHoras() + " sendo o valor por hora " + f.getValorPagoHoras() +
                " resultando no seu salario de :" + (f.getHoras() * f.getValorPagoHoras());
    }


    // Construtor e getters/setters
    public abstract double calcularSalario(int horas, double valorPagoHoras);
}
