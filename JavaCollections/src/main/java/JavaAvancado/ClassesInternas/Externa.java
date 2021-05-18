package JavaAvancado.ClassesInternas;

public class Externa {
    private String nome = "Externa";

    public class Interna{
        private  String nome = "Interna";

        public void printar(){
            System.out.println(nome);
            //Acessa método externo
            System.out.println(Externa.this.nome);
        }
    }


    public static void main(String[] args) {
        Externa e = new Externa();
        Interna i = e.new Interna(); //Primeiro precisa de instancia da externa.
                                    //Caso INTERNA fosse static não precisa da instancia externa

        i.printar();
    }
}

