package br.com.questoes;

public class Calculadora {

    private String descrição;
    private double memoria;


    public Calculadora(String descrição, double memoria) {
        this.descrição = descrição;
        this.memoria = memoria;

    }

    public double somar(double numero, double outronumero){

        return numero + outronumero;

    }

    public double subtrair (double numero, double outronumero){

        return numero - outronumero;

    }

    public  double multiplicar( double numero, double outronumero){

        return numero*outronumero;


    }
    public double dividir( double numero, double outronumero){

        return numero/outronumero;
    }

    public void gravarMemoria(double memoria) {

        this.memoria = memoria;

    }



    //Métodos padrões

    public String getDescrição() {

        return descrição;
    }

    public void setDescrição(String descrição) {

        if(descrição!=null){
            this.descrição = descrição;
        }
    }

    public double getMemoria() {
        return memoria;
    }

}

/// Obs: Concluir método memória depois

