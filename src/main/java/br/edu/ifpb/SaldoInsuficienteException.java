package br.edu.ifpb;

public class SaldoInsuficienteException extends Exception {



    public SaldoInsuficienteException(String m){

        super(m);

    }

    public SaldoInsuficienteException() {

        super("Saldo insuficente (construtor vazio)");

    }

}
