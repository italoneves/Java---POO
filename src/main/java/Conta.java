import br.edu.ifpb.QuantiaNegativaException;
import br.edu.ifpb.SaldoInsuficienteException;

import java.util.Collections;
import java.util.Objects;

public class Conta{

    private int numero;
    private String nome;
    private  double saldo;


    public Conta(int numero, String nome) {

        this(numero,nome, 10.00);

    }

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = Objects.requireNonNull(nome);

    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    // Novos métodos

    public boolean depositar(double valor) throws QuantiaNegativaException{

        if (valor<=0) {

            throw new QuantiaNegativaException("Não é possível depositar um valor menor/igual a zero");

        }
        this.setSaldo(this.getSaldo()+valor);
        return true;


    }

    public boolean sacar(double valor) throws SaldoInsuficienteException {

        if(this.getSaldo()< valor || valor<= 0){

            throw new SaldoInsuficienteException();
            //throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        this.setSaldo(this.getSaldo()-valor);

        return true;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return this.getNumero() == conta.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getNumero());
    }


    @Override
    public String toString() {
        return "Conta " +
                "numero:" + this.getNumero() +
                ", nome:" + this.getNome() +
                ", saldo:" + this.getSaldo();
    }
}