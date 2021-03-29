import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Banco{

    //headSet, tailSet, subSet, (test_tree.first(), last -> último ou primeiro elemento da lista
    //lower, floor, ceiling, higher


    private NavigableSet<Conta> test_tree = new TreeSet<>(); // navigableset funciona os demais métodos.



    public NavigableSet<Conta> getTest_tree() {

        return test_tree;

    }

    public boolean cadastrarConta(Conta c) {

        return test_tree.add(c);

    }

    public boolean buscarPelaConta (Conta c){

        return test_tree.contains(c);

    }

    public boolean buscarPeloNumero (int numero){

//      anyMatch retorna true ou false

        return test_tree.stream().anyMatch(num-> num.getnumero()==numero);

//        List<Conta> resultado = test_tree.stream().filter(n-> n.getnumero() == numero).collect(Collectors.toList());
//        return  Collections.unmodifiableList(resultado); // Retorna uma lista imutavel

    }


    public Set<Conta> buscarEntreValores (double x, double y){

        //Também poderia usar o subSet, mas seria mais trabalhoso.

        Set<Conta> entreValores = test_tree.stream().filter(v -> v.getSaldo() >= x && v.getSaldo() <= y)
                .collect(Collectors.toSet());
        
        return Collections.unmodifiableSet(entreValores);

    }

    public void imprimir(){

//      test_hash.forEach(n -> System.out.println(n));
        test_tree.forEach(System.out::println);

    }

    public NavigableSet ordenarComNovoComparator(Comparator<Conta> comparador){

        NavigableSet<Conta> setOrdemSalario = new TreeSet<>(comparador);

        setOrdemSalario.addAll(getTest_tree());

        return setOrdemSalario;

    }

    public List imprimirOrdenadoPeloSaldo()
    {
        // Suponha que quero imprimir ordenado pelo saldo.

        return test_tree.stream().sorted(Comparator.comparingDouble(Conta::getSaldo)).collect(Collectors.toList());

        //Não funciona com set, dá como redundante.

    }


//    public Conta testeRetornoObjeto (int num ){
//
//
//        Optional<Conta> teste = test_tree.stream().filter(val -> val.getnumero() == num).findFirst();
//
//        return teste.orElseThrow();
//
//    }
//
//    //Não ta funcionando até o momento devido ao comparador
//
//    public Set<Conta> buscarClienteAté (double valor){
//
//        //tem que ordenar de acordo com que pretende buscar
//
//        Conta retorno = encontraValor(valor);
//
//        return test_tree.headSet(retorno);
//
//        //        anyMatch retorna true ou false
////        return test_hash.stream().anyMatch(n-> n.getTitular().equals(nome));
//    }
//




}

