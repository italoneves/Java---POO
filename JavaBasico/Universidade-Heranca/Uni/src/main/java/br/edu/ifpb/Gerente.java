package br.edu.ifpb;



// Usar hamcrest


import java.util.Objects;

public class Gerente extends Funcionario{

    private double comissão;
    private static final double salario_base = 5000.00;


    // Contrutores

    //Em caso de o usuário não informar nada
    public Gerente() {

        super();    // Chamo o contrutor que não recebe nada da superclasse
        this.setComissão(0);
    }

    //Caso informe esse construtor vai atribuir valores aos atributos.
    public Gerente(int matricula, int idade, String nome,double comissão) {

        super(matricula,idade,nome); // Chamo o construtor da superclasse
        this.setComissão(comissão);    //
    }

    // Métodos getter e setter


    public double getComissão() {

        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;

    }
//    // Sobreescrevi o  método getSalario, portanto quando eu chamar um objeto dessa classe vai ter com saida esse método aqui.
//    @Override
//    public double getSalario() {
//
//        return super.getSalario() + this.getComissão(); //Super. chama o método da superclasse soma com comissão e retorna o total.
//    }

    @Override
    public double calcularSalario() {

        return salario_base + this.getComissão();

    }





    @Override
    public String toString() {

        return super.toString()  + " Salário Total: " + this.calcularSalario();
    }
}
