package ExemploException;

public class ExemploException {

    public static void teste () throws Exception {


        String [] arrayTeste = new String[10];

        for (int i=0; i<arrayTeste.length; i++){
            System.out.println(arrayTeste[i]);
            if(i==2){
                throw new Exception();
            }
        }

    }


    public static void main(String[] args)  {

        try {

            ExemploException.teste();

        }catch (Exception e){
            //throw new ArrayIndexOutOfBoundsException();
            System.out.println("Exception criado, por percorer o indice 2(Apenas teste)");
        }

        System.out.println("Continua aqui o programa.....");


    }


}
