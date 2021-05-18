package ExemploOptinal;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ExOptinal {

    public static void main(String[] args) throws NullPointerException {
        // pode receber null
        Optional<Double> retorno1 = Optional.ofNullable(null);
        Optional<String> retorno2 = Optional.of("nome");
        Optional<Double> retorno3 = Optional.empty();


        if (retorno2.isPresent()){ //Verifico se não ta vazio
            String r = retorno2.get();
            System.out.println("Print String peguei com o GET: " + r);
        }

         OptionalDouble.of(12).ifPresent(System.out::println); // Printa valor em double
         retorno1.map((valor) -> valor * 2).ifPresent(System.out::println);
//-----------------------------------------------------------------------------------------------------------------------------
       //OrElseThrow no service

        Cliente c1 = new Cliente();
        Service s = new Service();

        try {
            s.buscarIdade(c1);

        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }


    }

    //retorno.isPresent(System.out::println);
    //retorno.ifPresentOrElse(System(Se não for vazio) ,System(se é vazio)); //JAVA 9
}
