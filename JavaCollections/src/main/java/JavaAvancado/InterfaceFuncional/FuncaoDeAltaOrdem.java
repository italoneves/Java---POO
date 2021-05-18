package JavaAvancado.InterfaceFuncional;

public class FuncaoDeAltaOrdem {

    public static void main(String[] args) {

        Calculo<String, Integer,Integer> somar = (nome, num1, num2) -> nome + (num1+num2);
        Calculo<String, Integer,Integer> dividir = (nome, num1, num2) -> nome+ (num1/num2);

        System.out.println(executarCalculo(somar,"Função Somar: ", 15, 8));
        System.out.println(executarCalculo(dividir,"Função Dividir: ", 207, 2));

//        System.out.println(somar.calcular("Função Somar: ", 15, 8).);
//        System.out.println(dividir.calcular("Função Dividir: ", 207, 2));

    }

    public static String executarCalculo(Calculo c, String nome,  Integer num1, Integer num2){
        return String.valueOf(c.calcular(nome,num1,num2));
    }

}


@FunctionalInterface
interface Calculo <T,B,J> {

    public T calcular(T n, B a, J b);

//    void teste (int a, int b);
}
