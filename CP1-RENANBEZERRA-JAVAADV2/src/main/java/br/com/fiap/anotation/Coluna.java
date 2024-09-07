package br.com.fiap.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define ate quando a anotacao estara presente (codigo fonte, compilacao, execucao)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {
    String nome();
    double tamanho() default 0;
    boolean obrigatorio() default false;
}
