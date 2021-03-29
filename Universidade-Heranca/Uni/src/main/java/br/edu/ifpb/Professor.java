package br.edu.ifpb;

public class Professor extends Funcionario{

    private int numHoras;
    private static final double salario_base = 2000.00;

    //Construtores
    public Professor() {

        super();
        this.setNumHoras(0);

    }

    public Professor(int matricula, int idade,String nome, int numHoras) {

        super(matricula,idade,nome);
        this.setNumHoras(numHoras);
    }

    //Getter e Setter

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

//    //Sobrescrevi o método getSalario da superclasse
//    @Override
//    public double getSalario() {
//
//        return super.getSalario() +   2 * getNumHoras();


    @Override
    public double calcularSalario() {
        return salario_base+(2*getNumHoras());
    }

    @Override
    public String toString() {

        return super.toString() +" Salário Total: " + this.calcularSalario();

    }
}
