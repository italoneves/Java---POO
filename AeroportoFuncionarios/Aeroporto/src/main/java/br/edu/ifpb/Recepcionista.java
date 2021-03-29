package br.edu.ifpb;

public class Recepcionista extends Funcionario{

    private int horaextra;


    public Recepcionista(String nome, int idade, double salariobase, int horaextra) {
        super(nome, idade,salariobase);
        this.setHoraextra(horaextra);

    }

    public Recepcionista(){

        this("Não informado", 0, 0, 0);
    }


    public int getHoraextra() {
        return horaextra;
    }

    public void setHoraextra(int horaextra) {
        this.horaextra = horaextra;
    }

    @Override
    public double calcularSalario() {

        return (getSalariobase() + getHoraextra()*2);
    }


    @Override
    public String toString() {
        return super.toString() + " Salário: " + calcularSalario();
    }
}


