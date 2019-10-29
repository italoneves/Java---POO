import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Banco{


    private String nome;

    private Set<Conta> listaContas = new HashSet<>();


    public Banco() {

        this("Sem nome");
    }

    public Banco(String nome) {
        this.nome = nome;

    }


    public boolean adicionarConta(Conta c){

        return listaContas.add(c);

    }

    public boolean removerConta(Conta c){

        return listaContas.remove(c);

    }

    public void imprimir(){

        listaContas.forEach(System.out::println);

    }


}