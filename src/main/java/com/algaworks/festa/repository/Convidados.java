package com.algaworks.festa.repository;

import com.algaworks.festa.model.Convidado;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Convidados {
    private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();
    static {
        LISTA_CONVIDADOS.add(new Convidado("Carlos", 2));
        LISTA_CONVIDADOS.add(new Convidado("João", 3));
        LISTA_CONVIDADOS.add(new Convidado("Maria", 1));
    }

    public List<Convidado> todos() {
        return Convidados.LISTA_CONVIDADOS;
    }

    public void adicionar(Convidado convidado) {
        Convidados.LISTA_CONVIDADOS.add(convidado);
    }


}
