package br.com.questoes;


import java.util.Scanner;

public class Menu_calculadora{

    @Override
    public String toString() {
        return "Calculadora" +
                "__________________\n"+
                "1. Somar\n" +
                "2. Subtrair\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "5. Sobre a Calculadora\n" +
                "0. Sair\n" +
                "Digite uma opção: ";
    }

    public double[] capturarDados(){

        double[] vetor_num = new double[2];

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número da operação  :");
        vetor_num[0] = input.nextDouble();
        System.out.print("Digite o segundo número da operação  :");
        vetor_num[1] = input.nextDouble();

        return  vetor_num;

    }


}
