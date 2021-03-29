package br.edu.ifpb;

import java.util.Objects;

public class Cliente {

    private int matricula;
    private String nome;

    public Cliente(int matricula, String nome) {
        this.setMatricula(matricula);
        this.setNome(nome);
    }



    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return getMatricula() == cliente.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "matricula=" + matricula +
                ", nome='" + nome + '\'';
    }
}
