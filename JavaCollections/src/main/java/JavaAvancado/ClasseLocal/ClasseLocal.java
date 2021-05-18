package JavaAvancado.ClasseLocal;

import JavaAvancado.ClassesInternas.Externa;

public class ClasseLocal {

    //Método
    public void metodoQualquer(){
        //Classe
        class Interna{
            private String nome = "teste";

            //Método
            public void printar (){
                System.out.println(nome);
            }
        }

        Interna i = new Interna();
        System.out.println(i.nome);

    }

    public static void main(String[] args) {
        ClasseLocal cl = new ClasseLocal();
        cl.metodoQualquer(); //printa o da classe interna

    }
}
