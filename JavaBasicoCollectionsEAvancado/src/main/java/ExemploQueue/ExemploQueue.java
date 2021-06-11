package ExemploQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        //FILA
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Maria");
        filaBanco.add("José");
        filaBanco.add("Fulano");

        System.out.println(filaBanco);
        System.out.println("PEEK " +filaBanco.peek()); //RETORNA 1° ELEMENTO // MAS NÃO REMOVE
        System.out.println(filaBanco);
        System.out.println("REMOVE "+filaBanco.remove()); // RETORNA 1°ELEMENTO E REMOVE, RETORNA EXCEPTION CASO VAZIA
        System.out.println(filaBanco);
        System.out.println("POOL "+ filaBanco.poll());   // RETORNA 1° ELEMENTO E REMOVE
        System.out.println(filaBanco);
        System.out.println("Elemento "+ filaBanco.element());//RETORNA 1° ELEMENTO MAS NÃO REMOVE,  RETORNA EXCEPTION CASO VAZIA
        System.out.println(filaBanco);


        filaBanco.clear();
        System.out.println(filaBanco.poll());

    }
}
