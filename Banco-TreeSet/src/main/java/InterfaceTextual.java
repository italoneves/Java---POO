import java.util.*;


     /*DÚVIDAS::
          return  orElseThrow(); FUNÇÃO DESSE MÉTODO ?

      */
//      headSet, tailSet, subSet, (test_tree.first(), last -> último ou primeiro elemento da lista
//      lower, floor, ceiling, higher


public class InterfaceTextual{
    public static void main( String[] args )
    {

        Banco b = new Banco();

        Conta c1 = new Conta(9, "Ítalo Santos", 1800);;
            Conta c2 = new Conta(7, "Antonio José Neves", 2500);
            Conta c4 = new Conta(1,"Edieluza dos Santos Neves", 1100);
            Conta c5 = new Conta(3,"Iasmyn Vasiljevic", 1000);
            Conta c9 = new Conta(13,"Usuario teste", 1000);

//Não são adicionados pois tem o mesmo nome (compareTo e equals)

            Conta c7 = new Conta(15, "Ítalo Santos", 10);
            Conta c8 = new Conta(8, "Antonio José Neves", 10);



//CADASTRAR CONTAS (NA DEFINIÇÃO DO MEU EQUALS E COMPARETO, SÓ NÃO É ADICIONADO SE TIVER MESMO NOME)

     b.cadastrarConta(c1);
     b.cadastrarConta(c2);
     b.cadastrarConta(c4);
     b.cadastrarConta(c5);
     b.cadastrarConta(c9);
    //FALSE POIS TEM O MESMO NOME
    b.cadastrarConta(c7);
    b.cadastrarConta(c8);

//IMPRIMIR TREESETOMPLETO

        System.out.println("\n" +
                "Imprimindo TreeSet após adicionar e excluir duplicatas pelo nome: " +
                "\n");
        b.imprimir();

//BUSCAR CONTA PELO OBJETO

       //System.out.println("Tem a conta? " + b.buscarPelaConta(c2));
       // if(b.buscarPelaConta(c1)) System.out.println("Conta localizada");



//BUSCAR CLIENTE PELO NOME (PODE RETORNAR UM LISTA COM OS DADOS DO CLIENTE USANDO FILTER/ TRUE E FALSE -> ANYMATCH)

        Set<Conta> retornoSet = new TreeSet<>();
//        lista = b.buscarClienteAté(1500);
//        System.out.println("Usúario que tem até 1500: ");
//        lista.forEach(System.out::println);


//BUSCAR CLIENTE PELO NÚMERO DA CONTA

        boolean r = b.buscarPeloNumero(3);
//       if(!lista.isEmpty()) System.out.println("Seus dados no BB: ");
//       lista.forEach(System.out::println);

        System.out.println("\n" +
                "Cliente entre respectivos valores(Filter): " +
                "\n");
       retornoSet = b.buscarEntreValores(200, 1800);
        retornoSet.forEach(System.out::println);

        System.out.println("\n" +
                "Ordenando com novo comparator" +
                "\n");

        //ComparatorSaldo comparatorSaldo = new ComparatorSaldo(); // É uma opção também.

        NavigableSet<Conta> retorno = b.ordenarComNovoComparator(Comparator.comparing(Conta::getSaldo));
        retorno.forEach(System.out::println);

        System.out.println("\n" +
                "Printando em nova ordem com o sorted sem excluir duplicatas" +
                "\n");

       List<Conta> novoTeste= b.imprimirOrdenadoPeloSaldo();
       novoTeste.forEach(System.out::println);


       // RETORNA O OBJETO
//        Conta cteste = b.testeRetornoObjeto(13);
////        cteste.depositar(12020);


    }
}
