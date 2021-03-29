package br.edu.ifpb;

//Métodos abstratos da classe abstrata obrigatoriamente devem ser implementados
//Todos os métodos uma interface devem ser implementados na classe filha
public class Piloto extends  Funcionario implements  DescontoImposto{


    private double comissao;

//    Construtores
    public Piloto(String nome, int idade, double salariobase, int comissao) {
        
        super(nome,idade,salariobase);
        this.setcomissao(comissao);
    }

    
    public Piloto(){

        this("Não informado", 0, 0, 0);
    }

//    Métodos
    public double getcomissao() {

        return comissao;

    }

    public void setcomissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario() {

        return getcomissao() + getSalariobase() - descontoSalario();
    }


    @Override
    public double descontoSalario() {

        return getcomissao() + getSalariobase()* 0.08;
    }

    @Override
    public String toString() {
        return super.toString() + " Sálario: " + calcularSalario() ;
    }
}
