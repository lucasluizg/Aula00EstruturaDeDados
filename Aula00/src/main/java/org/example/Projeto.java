package org.example;

public class Projeto {

    private String nome;
    private Gerente dono;
    private Equipe equipe;

    public Projeto(String nome, Gerente dono, Equipe equipe) {
        this.nome = nome;
        this.dono = dono;
        this.equipe = equipe;
    }

}