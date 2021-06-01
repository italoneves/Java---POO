import java.util.function.Function;

//JAVA 11
public class ExemploInferenciaLambdas {



    public static void main(String[] args) {
        Function<Integer,Double> multi = (var num) -> num*2.0;
        multi.apply(10);

    }


}
