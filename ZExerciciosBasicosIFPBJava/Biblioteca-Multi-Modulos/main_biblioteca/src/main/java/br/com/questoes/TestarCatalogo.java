package br.com.questoes;

import java.util.Scanner;

public class TestarCatalogo
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        Scanner buffer = new Scanner(System.in);

        CatalogoLivros c1 = new CatalogoLivros();

        int cod =-1;
        do {

            System.out.print("Deseja cadastrar um livro (1(sim)/0(não): ");
            cod = buffer.nextInt();

        switch (cod) {

                case 1:

                    System.out.print("Digite o nome do livro que deseja adicionar na lista: ");
                    String nome = input.nextLine();

                    System.out.print("Digite o nome do autor: ");
                    String autor = input.nextLine();

                    System.out.print("Digite a editora: ");
                    String editora = input.nextLine();

                    System.out.print("Digite o código: ");
                    int codigo = buffer.nextInt();

                    Livro L = new Livro(nome, autor, editora, codigo);

                    c1.cadastrarLivros(L);
                break;


            }

        }while(cod!=0);

        c1.imprimirLista();

        System.out.println("\nfim");
    }
}
