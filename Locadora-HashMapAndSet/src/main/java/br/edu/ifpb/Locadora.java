package br.edu.ifpb;

import java.util.*;

public class Locadora {

    private String descrição;

    private Set<Cliente> clienteSet = new HashSet<>();
    private  Set<Dvd> dvdHashSet = new HashSet<>();
    private Map<Integer, Integer> testeMap = new HashMap<>();



    public Locadora(String descrição) {

        this.setDescrição(descrição);

    }

    //Get e set
    public String getDescrição() {

        return descrição;

    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    //Métodos Implementados
    public boolean adicionarCliente(Cliente c){

        return clienteSet.add(c);

    }

    public boolean adicionarDvd(Dvd d){

        return dvdHashSet.add(d);

    }

    public boolean buscarId(int chave){

        return testeMap.containsKey(chave);

    }

    public boolean buscarValor( int valor){

        return testeMap.containsValue(valor);


    }

    public Integer buscarDado(int chave){

       return testeMap.get(chave);

    }

    public int tamanhoMap (){

        return testeMap.size();

    }

    public void imprimirMap(){


        System.out.println(testeMap);
        dvdHashSet.stream().forEach(System.out::println); //Dvd id=1, nome='Não sei' // Dvd id=2, nome='Já deu certo'
        //System.out.println(clienteSet); [Cliente:matricula=13, nome='Ítalo Santos', Cliente:matricula=14, nome='César Vasconcelos']

    }

    public Integer emprestarDvd(int  idDvd, int matriculaCliente){

        return testeMap.put(idDvd,matriculaCliente);

    }


}
