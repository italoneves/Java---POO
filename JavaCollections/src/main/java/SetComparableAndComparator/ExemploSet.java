package SetComparableAndComparator;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

        Set<Double> teste = new HashSet<>(); //Não tem ordem, Não permite duplicatas
        teste.add(6.0);
        teste.add(6.0);
        teste.add(4.0);
        teste.add(5.0);
        System.out.println("Print Hash Set "+ teste);

        Set<Double> novoTeste = new TreeSet<>(); //Em ordem de acordo com Double implements Comparable do Double
        novoTeste.add(10.0);
        novoTeste.add(8.0);
        novoTeste.add(5.0);
        novoTeste.add(50.0);
        System.out.println("Tree Seet Double " + novoTeste);


        //Por padrão não permite repetidos
        //É SEMPRE BOM MANTER EQUALS E COMPARETO NO MESMA COMPARAÇÃO
        Set<Cliente> listaClient = new TreeSet<>();
        Cliente c1  = new Cliente("Fulano G", 25,"Mascul");
        Cliente c2 = new Cliente("Fulano A", 25,"Masculino");

        System.out.println(c1.equals(c2));

        listaClient.add(new Cliente("EFulano ", 108,"Masculino"));
        listaClient.add(new Cliente("AFulano ", 54,"Masculino"));
        listaClient.add(new Cliente("KFulano ", 25,"Masculino"));
        System.out.println("ORDENADO PELO NOME");
        System.out.println(listaClient);

//--------------------------------------------------------------------------------------------------------------------------
    //COMPARATOR
        //Jeito mais simples
        Set novo = new TreeSet(new ClienteComparatorIdade());
        novo.addAll(listaClient);

        ClienteComparatorIdade clienteComparatorIdade = new ClienteComparatorIdade();
        //Forma mais trabalhosa
        List<Cliente> listaDeSet = new ArrayList<>();
        listaDeSet.addAll(listaClient); //Transformo o set em uma lista
        Collections.sort(listaDeSet, new ClienteComparatorIdade()); //Faço a compararaçao com comparator
        System.out.println("ORDENADO PELA IDADE");
        System.out.println(listaDeSet);
    }


}
