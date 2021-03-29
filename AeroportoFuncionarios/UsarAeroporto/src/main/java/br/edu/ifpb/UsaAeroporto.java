package br.edu.ifpb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class UsaAeroporto
{
    public static void main( String[] args )
    {

        List<Funcionario> lista_poli = new ArrayList<>(Arrays.asList(new Piloto("Ítalo", 57, 2500, 500),
                new Recepcionista("Edileuza", 96, 2000, 2),
                new Piloto("Antonio",85,3000,500 ),
                new Recepcionista("Iasmyn", 56, 1500, 2)));



//
//        Método 1:Já printa valores depois de filtar devido ao forEach
//                lista_poli.stream().filter(idade -> idade.getIdade()>56).filter(salario->salario.calcularPagamento() > 2000).
//                        collect(Collectors.toList()).forEach(System.out::println);

//        Método 2: Retorna uma lista com filtro
        List<Funcionario> lista = lista_poli.stream().filter(idade -> idade.getIdade()>56).filter(salario->salario.calcularSalario() >=2000).
                collect(Collectors.toList());
        lista.stream().forEach(System.out::println);












//        Piloto p1 = new Piloto("Ítalo",57,2500,500 );
//        Recepcionista r1 = new Recepcionista("Edileuza", 56, 1500, 2);
//        Piloto p2 = new Piloto("Antonio",85,2000,500 );
//        Recepcionista r2 = new Recepcionista("Iasmyn", 56, 1500, 2);
//
//        System.out.println(p1); // Chama o to string
//        System.out.println(r1);


    }
}
