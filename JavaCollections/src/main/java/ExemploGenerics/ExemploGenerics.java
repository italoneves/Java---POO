package ExemploGenerics;

import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Teste");
        lista.add("novo");
        lista.add("fulano");

        add(lista,1L);

        for (Object s: lista) {

            System.out.println(s);

        }

    }

    public static  void add(List lista, Long l){
        lista.add(l);

    }
}
