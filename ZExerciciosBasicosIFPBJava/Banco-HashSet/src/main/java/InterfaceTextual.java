import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class InterfaceTextual
{
    public static void main( String[] args )
    {

            List<Conta> lista = new ArrayList<>();
            Conta c1 = new Conta(1313, "Ítalo Santos", 10);
            Conta c2 = new Conta(1314, "Antonio José Neves", 10); // posso colocar para
                                                                                       //coloquei no equals numero && nome do titular
            Conta c3 = new Conta(1315,"Ítalo Santos", 10);
            Conta c4 = new Conta(1316,"Edieluza dos Santos Neves", 10);
            Conta c5 = new Conta(1317,"Iasmyn Vasiljevic", 10);

            //Não são adicionados pois tem o mesmo NÚMERO.

            Conta c7 = new Conta(1313, "Ítalo Santos", 10);
            Conta c8 = new Conta(1314, "Antonio José Neves", 10);


            c1.depositar(-10);
            c2.depositar(1500);
            c3.depositar(6000);

            c2.sacar(50);

            Banco b = new Banco();

//CADASTRAR CONTAS (NA DEFINIÇÃO DO MEU EQUALS, SÓ NÃO É ADICIONADO SE TIVER MESMO NÚMERO DE CONTA

        System.out.println(b.cadastrarConta(c1));
        System.out.println(b.cadastrarConta(c2));
        System.out.println(b.cadastrarConta(c3));
        System.out.println(b.cadastrarConta(c4));
        System.out.println(b.cadastrarConta(c5));
        //FALSE
        System.out.println(b.cadastrarConta(c7));
        System.out.println(b.cadastrarConta(c8));


//BUSCAR CONTA PELO OBJETO
       //System.out.println("Tem a conta? " + b.buscarPelaConta(c2));

        if(b.buscarPelaConta(c1)) System.out.println("Conta localizada");

//IMPRIMIR HASHSE COMPLETO
        b.Imprimir();

//BUSCAR CLIENTE PELO NOME (PODE RETORNAR UM LISTA COM OS DADOS DO CLIENTE USANDO filter OU true e false USANDO anyMatch


        lista = b.buscarPeloNome("Ítalo Santos");
        System.out.println("Usúario encontrado: ");
        lista.forEach(System.out::println);


//BUSCAR CLIENTE PELO NÚMERO DA CONTA

        lista = b.buscarPeloNumero(1317);
       if(!lista.isEmpty()) System.out.println("Seus dados no BB: ");
        lista.forEach(System.out::println);


    }


}


