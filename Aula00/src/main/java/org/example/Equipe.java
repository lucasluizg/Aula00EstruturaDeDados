package org.example;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    List<Funcionario> equipe = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        equipe.remove(funcionario);
    }

}