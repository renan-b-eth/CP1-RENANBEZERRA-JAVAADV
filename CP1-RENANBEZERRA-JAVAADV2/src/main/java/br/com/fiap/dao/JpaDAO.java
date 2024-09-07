package br.com.fiap.dao;

import br.com.fiap.anotation.Tabela;

public class JpaDAO {
    public String pesquisar(Object obj) {
        Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
        if (anotacao != null) {
            return "SELECT * FROM " + anotacao.nome();
        } else {
            return "SELECT * FROM TAB_FUNCIONARIO";
        }
    }

}
