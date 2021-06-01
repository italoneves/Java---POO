package ExemploList;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {


    public static void main(String[] args) {
        List nomes;
        nomes = new ArrayList<String>();

        nomes.add("Maria");
        nomes.add("kelven");
        nomes.add("João");
        nomes.add("Karen");
        nomes.add("Amanda");
        nomes.add("Ítalo");

        System.out.println(nomes); // Print em ordem padrão
        Collections.sort(nomes); //Coloca em ordem
        System.out.println(nomes); //Print em ordem normal

        nomes.set(1,"Novo nome posição 1 (2)"); //Colocando novo nome em uma posição

        System.out.println(nomes);

        System.out.println(nomes.get(5));//Retorna o objeto do index 5

        System.out.println(nomes.contains("Ítalo")); //O elemento Ítalo exista na lista? retorna true ou false

        nomes.indexOf("Ítalo"); //Retorna indice da posição de Ítalo ou -1 se não existir

        System.out.println("AQUIIIII");
        System.out.println(nomes.remove("pau"));

        Iterator<String> i = nomes.iterator(); //Lista com elementos para iterar

        while (i.hasNext()){ //retorna true se ainda tiver elemento
            System.out.println(i.next());
        }

        List<String> novaLista =  new ArrayList<String>();
        novaLista.add("Novo nome 1");
        novaLista.add("Novo nome 2");

        novaLista.addAll(nomes); //Acrescenta elementos no final desse Array list
        System.out.println(novaLista);

    }


}
