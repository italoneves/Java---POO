package br.edu.ifpb;

import java.util.Objects;

public abstract class Funcionario {

    private int matricula;
    private int idade;
    private  String nome;
    private double salario;


    //Construtores

    public Funcionario(int matricula, int idade, String nome) {

        // Importante passar para os métodos pois já posso verificar o dado antes de atribuir o valor
        // a váriavel (Criar regra de integridade nos métodos)

        this.setMatricula(matricula);
        this.setIdade(idade);
        this.setNome(nome);

    }

    public Funcionario() {
        //Chamo o construtor da própria classe e passo os atributos que desejo
        // caso o usuário não tenha informado

        this(0, 0, "Não definido");

    }

    //Métodos getter e setter

    public int getMatricula() {

        return matricula;
    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


    public abstract double calcularSalario();



    @Override
    public String toString() {

        return "Nome: " + this.getNome() + ", Matricula: " + this.getMatricula();

    }
}
