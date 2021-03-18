package br.com.questoes;


public class Livro
{
    private String nome;
    private String autor;
    private String editora;
    private int codigo;



    //Construtores

    public Livro(String nome, String autor, String editora, int codigo) {

        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.codigo = codigo;

    }

    public Livro(){

        setNome("Não definido");
        setAutor("Não definido");
        setEditora("Não definido");
        setCodigo(0);


    }

    //Métodos padrões

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        if (nome != null && nome.length() > 0) {
            this.nome = nome;
        }
    }


    public String getAutor() {

        return autor;

    }

    public void setAutor(String autor) {

        if (autor != null && autor.length() > 0) {

            this.autor = autor;
        }

    }


    public String getEditora() {

        return editora;
    }

    public void setEditora(String editora) {

        if (editora!= null && editora.length() > 0) {

            this.editora = editora;
        }


    }


    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {


        if (codigo>0) {

            this.codigo = codigo;
        }
    }

    @Override
    public String toString() {
        return "\n"+"Nome:" + nome  + ",Autor:" + autor + ",Editora:" + editora + ",Código: " +codigo;
    }
}
