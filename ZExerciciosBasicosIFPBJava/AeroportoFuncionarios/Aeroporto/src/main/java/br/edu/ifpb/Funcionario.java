package br.edu.ifpb;


//Se a classe não implementa o método da interface obrigatoriamente tem que ser ABSTRACT
public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salariobase;

    public Funcionario(String nome, int idade, double salariobase) {
       this.setNome(nome);
       this.setIdade(idade);
       this.setSalariobase(salariobase);

    }

    public Funcionario() {

        this("Não definido", 0,0);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public abstract double calcularSalario();



    @Override
    public String toString() {

        return "Nome: " + getNome()+ " Idade: "+getIdade();
    }


}
