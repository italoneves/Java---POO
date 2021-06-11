package ZJavaAvancado.ClassesAnonimas;


public class ExemploClasseAnonima {

    //Classe anônima cachorro. ExemploClasseAnonima Extends Cachorro
    Cachorro c = new Cachorro(){
        @Override
        public void printarCachorro() {
            System.out.println("Cachorro calado");
        }
    };

    //Clase anônima passaro
    Passaro p = new Passaro(){
        @Override
        public void printarPassaro() {
            System.out.println("Pássaro cantando");
        }
    };// ;



    public static void main(String[] args) {

        ExemploClasseAnonima e = new ExemploClasseAnonima();
        e.p.printarPassaro();
        e.c.printarCachorro();

    }

}

//Classe Passaro
class Passaro{

    public void printarPassaro(){
        System.out.println("Pássaro calado");
    }

}
