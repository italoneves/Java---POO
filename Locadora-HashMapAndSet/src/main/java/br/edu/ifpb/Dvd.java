package br.edu.ifpb;

import java.util.Objects;

public class Dvd {

    private int id;
    private  String nome;

    public Dvd(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        Dvd dvd = (Dvd) o;
        return getId() == dvd.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Dvd " +
                "id=" + id +
                ", nome='" + nome + '\'' ;
    }
}
