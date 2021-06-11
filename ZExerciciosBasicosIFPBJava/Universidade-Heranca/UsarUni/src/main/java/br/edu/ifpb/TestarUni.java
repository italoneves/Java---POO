package br.edu.ifpb;


import java.util.Scanner;

public class TestarUni
{
    public static void main( String[] args )
    {
        Universidade u1 = new Universidade("IFPB");
        Gerente g1 = new Gerente(13, 21, "Ítalo Santos Neves", 550);
        Professor p1 = new Professor(10, 40, "César", 15);
        Professor p2 = new Professor(13, 20, "Bruno", 16);
        Professor p3 = new Professor(15, 28, "Henrique", 17);

//Adicionar funcionários

        u1.adicionarFuncionario(g1);
        u1.adicionarFuncionario(p1);
        u1.adicionarFuncionario(p2);
        u1.adicionarFuncionario(p3);

//Remover funcionários

         //u1.removerFuncionario(13);

//Lista de Funcionários

        System.out.println("Lista de Funcionários:");

        System.out.print(u1.listarFuncionario());

//Quantidade de Funcionários
        System.out.println("\nQuantidade de funcionários: " + u1.quantFuncionario());


//Buscar Funcionário
        Funcionario f = null;

        f = u1.buscarFuncionario(10);

       if (f!=null) System.out.println("\nO funcionário que possui essa matricula é:\n"+ f);

//

//        System.out.println(g1.toString());
//        System.out.println(p1.toString());
    }
}
