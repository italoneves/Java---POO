package br.edu.ifpb;

public class TestarLocadora {

    public static void main( String[] args ) {

        Locadora l = new Locadora("Ja Paguei");

        Cliente c1 = new Cliente(13,"Ítalo Santos");
        Cliente c2 = new Cliente(14, "César Vasconcelos");

        Dvd d1 = new Dvd(1,"Não sei");
        Dvd d2 = new Dvd(2, "Já deu certo");

        l.adicionarCliente(c1);
        l.adicionarCliente(c2);
        l.adicionarDvd(d1);
        l.adicionarDvd(d2);

       l.emprestarDvd(1, 13);
       l.emprestarDvd(2, 14);
       l.emprestarDvd(1, 13);


        System.out.println("Contém a chave 1 ? " +l.buscarId(1));
        System.out.println("Contém o valor 17 ? " + l.buscarValor(17));

        System.out.println("Get Retorna o valor: " + l.buscarDado(2)); //Retorna o valor que ta associado a chave

        //Tamanho do mapa

        System.out.println(l.tamanhoMap());

        //IMPRIMIR MAPA

        l.imprimirMap();



    }
}
