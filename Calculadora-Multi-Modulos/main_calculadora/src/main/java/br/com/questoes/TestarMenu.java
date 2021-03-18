package br.com.questoes;

import java.util.Scanner;

public class TestarMenu {

    public static void main( String[] args ) {

        Menu_calculadora c1 = new Menu_calculadora();
        Calculadora c2 = new Calculadora("Calculadora A", 0);
        Scanner input = new Scanner(System.in);

        int opcao =-1;
        double num_1 = -1;
        double num_2 = -1;

        do {
            System.out.print(c1.toString());
            opcao = input.nextInt();

            switch (opcao){

                case 1:

                    double[] numeros = c1.capturarDados();
                    num_1 = numeros[0];
                    num_2 = numeros[1];
                    System.out.println("Resultado: "+ c2.somar(num_1,num_2));

                    break;

                case 2:
                    numeros = c1.capturarDados();
                    num_1 = numeros[0];
                    num_2 = numeros[1];
                    System.out.println("Resultado: "+c2.subtrair(num_1,num_2));

                    break;

                case 3:
                    numeros = c1.capturarDados();
                    num_1 = numeros[0];
                    num_2 = numeros[1];
                    System.out.println("Resultado: "+c2.multiplicar(num_1,num_2));

                    break;

                case 4:
                    numeros = c1.capturarDados();
                    num_1 = numeros[0];
                    num_2 = numeros[1];
                    System.out.println("Resultado: "+c2.dividir(num_1, num_2));

                    break;

                case 5:

                    System.out.println(c2.getDescrição());

                    break;

                default:
                    if (opcao!=0){
                        System.out.println("Você Escolheu um opção que não existe, Digite novamente!");
                        // Retorna para escolher opção
                    }

                    break;

            }
        }while (opcao!=0);

        System.out.println("Fim!");

    }

}
