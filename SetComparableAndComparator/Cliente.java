package SetComparableAndComparator;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    String nome;
    Integer idade;
    String Sexo;


    public Cliente(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        Sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }


    //Equals para o objeto
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cliente)) return false;
//        Cliente cliente = (Cliente) o;
//        return this.hashCode() == o.hashCode();
//    }

    //Equals para parametro especifico no caso (idade)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return this.idade == cliente.getIdade();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getSexo());
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.nome.compareTo(cliente.nome); //Para o compareTo deString
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Sexo='" + Sexo + '\'' +
                '}'+"\n";
    }
}
