package ExemploOptinal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nome = "Fulano";
    private Integer idade = null;
    private LocalDate dataNascimento = LocalDate.parse("02/10/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    public Cliente() {
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

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}



