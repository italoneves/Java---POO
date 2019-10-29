import br.edu.ifpb.QuantiaNegativaException;
import br.edu.ifpb.SaldoInsuficienteException;

import java.util.*;

public class InterfaceTextual
{
    public static void main(String[] args) {

        //Tirar duvida do acesso a conta// Porque verificar a entrada de dados com uma nova exceção se já tem pronto ?

        Banco b = new Banco("Banco do Brasil");
        Conta c1 = new Conta(1,"Ítalo");
        Conta c2 = new Conta(2,"Yury",1500);
        Conta c3 = new Conta(2,"José",100);

        b.adicionarConta(c1);
        b.adicionarConta(c2);
        b.adicionarConta(c3);

        Scanner entrada = new Scanner(System.in);
        boolean t = false;

        do {

            try {

                System.out.println("Digite o valor do saque: ");
                Double valorsaque = entrada.nextDouble();
                c2.sacar(valorsaque);
                System.out.println("Digite o valor do deposito: ");
                Double valordeposito = entrada.nextDouble();
                c2.depositar(valordeposito);
                t=true;


            }
            catch (SaldoInsuficienteException sie){

                System.out.println(sie.getMessage());
                entrada.nextLine();
            }
            catch (QuantiaNegativaException qne){

                System.out.println(qne.getMessage());
                entrada.nextLine();
            }
            catch (InputMismatchException ime){
                System.out.println("Entrada de dados incorreta. Digite novamente.");
                entrada.nextLine();
            }
        } while (!t);


        b.imprimir();



    }

}


