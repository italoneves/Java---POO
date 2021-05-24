package ZJavaAvancado.InterfaceFuncional;

import java.util.function.Consumer;

public class ConsumerInterfaceFuncional {

    //Recebe o parametro e usa da forma que recebeu
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(10);
    }
}
