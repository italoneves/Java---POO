package br.edu.ifpb;

public class QuantiaNegativaException extends Exception {

    public QuantiaNegativaException(String m) {

        super(m);
    }

    public QuantiaNegativaException() {

        super("Quantia negativa!");
    }
}
