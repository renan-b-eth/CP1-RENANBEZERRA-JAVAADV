package fiap;

import fiap.anotation.Coluna;
import fiap.beans.Funcionario;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("joao", 10, 10) {
            @Override
            public double calcularSalario(int horas, double valorPagoHoras) {
                return 0;
            }
        };
        //Recuperar o nome da classe atrav�s da API de Reflection
        String nomeClasse = funcionario.getClass().getName();
        System.out.println(nomeClasse);

        //Recuperar os m�todos da classe atrav�s da API de Reflection
        Method[] metodos = funcionario.getClass().getDeclaredMethods();

        //Exibir o nome dos m�todos
        for (Method m : metodos) {
            System.out.println(m.getName());
        }

        Field[] atributos = funcionario.getClass().getDeclaredFields();
        System.out.println(atributos.getClass().getName());
        //Exibir o nome e o tipo dos atributos
        for (Field f : atributos) {
            System.out.println(f.getName() + " " + f.getType());
            //Recuperar a anotação @Coluna
            Coluna anotacao = f.getAnnotation(Coluna.class);
            //Exibir os parametros da anotação
            System.out.println(anotacao.nome() + " " + anotacao.tamanho()
                    + " " + anotacao.obrigatorio());
            System.out.println("passou aqui");

        }

    }
}
