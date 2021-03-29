import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Banco {
    //Atributos

    private Set<Conta> test_hash = new HashSet<>();

    public boolean cadastrarConta(Conta c1) { // lembrar retorno em qualquer situação


        return test_hash.add(c1);

//        for (Conta c : lista_banco)
//
//            if (c.getnumero() == c1.getnumero()) return false;
//
//        return lista_banco.add(c1);

    }

    public boolean buscarPelaConta (Conta c){

        return test_hash.contains(c);


    }

    public List<Conta> buscarPeloNome (String nome){

         //anyMatch retorna true ou false
//        return test_hash.stream().anyMatch(n-> n.getTitular().equals(nome));

        //Filter Retorna uma lista
        List<Conta> resultado = test_hash.stream().filter(n-> n.getTitular().equals(nome)).collect(Collectors.toList());
        return  Collections.unmodifiableList(resultado); // Retorna uma lista imutavel

    }

    public List<Conta> buscarPeloNumero (int numero){

        //anyMatch retorna true ou false
//        return test_hash.stream().anyMatch(n-> n.getTitular().equals(nome));

        //Filter Retorna uma lista


        List<Conta> resultado = test_hash.stream().filter(n-> n.getnumero() == numero).collect(Collectors.toList());
        return  Collections.unmodifiableList(resultado); // Retorna uma lista imutavel

    }

    public void Imprimir(){

//        test_hash.forEach(n -> System.out.println(n));
        test_hash.forEach(System.out::println);

    }
}


