package JavaAvancado.InterfaceFuncional;

import java.util.function.Function;

public class FunctionInterfaceFuncional {
    //Recebe parâmetro e retorna parâmetro também
    public static void main(String[] args) {

        //Parametros -> Instrução
        Function<String,Integer> function = nome -> {
            Integer i = Integer.parseInt(nome)-2;
            return i;
        };

        Integer i = function.apply("20");
        System.out.println(i);

        System.out.println(function.apply("10"));


    }

}
