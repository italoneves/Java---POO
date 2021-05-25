package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ExemploStreams{

    public static void main(String[] args) {

       Set<Cliente> listaClient = new TreeSet<>();

        listaClient.add(new Cliente("EFbulano ", 96,"Masculino"));
        listaClient.add(new Cliente("AFulano ", 54,"Masculino"));
        listaClient.add(new Cliente("KBFulano ", 25,"Masculino"));
        listaClient.add(new Cliente("EFulbano ", 118,"Masculino"));
        listaClient.add(new Cliente("AFuflano ", 47,"Masculino"));
        listaClient.add(new Cliente("KFuslano ", 28,"Masculino"));

    //Retorna Quantidade de objetos no set
      Long l = listaClient.stream().count();
      System.out.println("Quantidade de objetos em uma lista: " + l);

      //Filtro um SET,  buscando nomes que contenham B e transformo em uma lista
     List<Cliente> s = listaClient.parallelStream()
             .filter(cliente -> cliente.getNome().contains("B")).
             collect(Collectors.toList());
        System.out.println("Retorna lista com os nomes que contém B: " + s);

        //Filtro nomes que tenham a letra B(coloco lowercase para não ter problemas com letras maiusculas
        //Faço um map para alterar os elementos e transformo em um SET.
     Set<String> retornoSet = listaClient.parallelStream()
             .filter(cliente -> cliente.getNome().toLowerCase().contains("b"))
             .map(cliente -> cliente.getNome() +" irineu")
             .collect(Collectors.toSet());
        System.out.println("Retorno de uma Set adaptada pelo MAP: "+ retornoSet);

        //Retorno os 4 primeiros elementos do set, com foreach
        //Em paralelo não print na ordem
        listaClient.parallelStream().limit(4).forEach(cliente -> System.out.println(cliente.toString()));
        //Print na ordem
        System.out.println("\n\nPrint em ordem, sem paralelismo");
        listaClient.stream().limit(4).forEach(cliente -> System.out.println(cliente.toString()));

        //Método reduce
        System.out.println(listaClient.stream().map(cliente -> cliente.getIdade()).reduce(0, Integer::sum));
        //System.out.println(listidade.stream().reduce(0, Integer::sum));
        int inicial =0;
        System.out.println(listaClient.stream().map(nome -> nome.getIdade())
                .reduce(inicial, (aux, outroValor) -> aux > outroValor ?
                        aux : outroValor));



        String nome = "teste";
        System.out.println(nome.substring(1,4));
    }
}
