package br.edu.ifpb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Universidade {

    private List<Funcionario> listadefuncionario = new ArrayList ();
    private String endereço;

    //Construtor
    public Universidade(String endereço) {

        this.endereço = endereço;

    }

    public boolean adicionarFuncionario(Funcionario fun) {

        if (Objects.isNull(fun))
            return false; // retorna null caso o objeto seja null


        for (Funcionario f : listadefuncionario) {

            if (f.getMatricula() == fun.getMatricula()) return false;
        }
        return listadefuncionario.add(fun); // true


    }

    public boolean removerFuncionario(int matricula) {

        for (Funcionario f : listadefuncionario) {

            if (matricula == f.getMatricula())

                return listadefuncionario.remove(f);
            }
        return false;
    }

    public String listarFuncionario() {
        String listafuncionarios = "";

        for (Funcionario f : listadefuncionario)
            listafuncionarios += f+ "\n";

        return listafuncionarios;

    }

    public int quantFuncionario(){

        return listadefuncionario.size();

    }

    public Funcionario buscarFuncionario(int matricula){

        for (Funcionario f : listadefuncionario)

            if (matricula == f.getMatricula()) return f;

        return null;
    }


}

