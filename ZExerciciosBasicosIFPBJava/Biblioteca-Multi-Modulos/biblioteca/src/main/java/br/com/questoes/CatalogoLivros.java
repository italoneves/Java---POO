package br.com.questoes;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros = null;

    //Construtor

    public CatalogoLivros() {

        listaLivros = new ArrayList<>();

    }

    // Métodos personalizados

    public boolean cadastrarLivros(Livro dadosLivros){

        for (Livro l1: listaLivros) {

            if (l1.getCodigo() == dadosLivros.getCodigo()) {

                return false;
            }

        }

        listaLivros.add(dadosLivros); //ADICIONA LIVRO POIS ELE AINDA NÃO EXISTE NO CATÁLOGO
        return true;
    }

    public void imprimirLista(){

        for (Livro elementosLista: listaLivros) {

            System.out.print(elementosLista);

        }
    }


}
