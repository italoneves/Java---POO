package Streams;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    String nome;
    Integer idade;
    String sexo;


    public Cliente(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
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
        return sexo;
    }

    public void setSexo(String sexo) {
        sexo = sexo;
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
        return this.idade.equals(cliente.getIdade());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getSexo());
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.idade.compareTo(cliente.idade);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Sexo='" + sexo + '\'' +
                '}'+"\n";
    }


}

