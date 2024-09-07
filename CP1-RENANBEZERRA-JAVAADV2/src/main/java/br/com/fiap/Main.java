package br.com.fiap;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.anotation.Tabela;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.dao.JpaDAO;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João Silva", 160, 15.0) {
            @Override
            public double calcularSalario(int horas, double valorPagoHoras) {
                return 0;
            }
        };
        Funcionario funcionario2 = new Funcionario("Glenda Delfy", 200, 18.0) {
            @Override
            public double calcularSalario(int horas, double valorPagoHoras) {
                return 0;
            }
        };

        // Exibindo informações dos funcionários
        System.out.println("Informações de João Silva:");
        funcionario1.mostrarInformacoes(funcionario1);
        System.out.println("\nSalário final de João Silva: " + funcionario1.salarioFinal(160, 15.0));

        System.out.println("\n\nInformações de Glenda Delfy:");
        funcionario2.mostrarInformacoes(funcionario2);
        System.out.println("\nSalário final de Glenda Delfy: " + funcionario2.salarioFinal(200, 18.0));

        // Demonstração do método calcularSalario
        double salarioJoao = funcionario1.calcularSalario(160, 15.0);
        double salarioMaria = funcionario2.calcularSalario(200, 18.0);

        JpaDAO dao = new JpaDAO();

        System.out.println(dao.pesquisar(funcionario1));

    }
}