import java.util.Objects;

public class Conta{


     //Atributos
     private int numero;
     private String titular;
     private double saldo;

     // Métodos

     public Conta() {

          this.setNumero(0);
          this.setTitular("Sem nome");
          this.saldo = 0;
     }

     public Conta(int numero, String titular, double saldo) {

          this.setNumero(numero);
          this.setTitular(titular);
          this.saldo = saldo;
     }


     public boolean sacar(double quantia) {

          this.saldo = (quantia > 0 && saldo >=quantia?saldo-quantia:this.saldo);

//          if (quantia > 0 && saldo < quantia) return false;
//          saldo -= quantia;

          return true;
     }

     public void depositar(double quantia) {

         this.saldo = (quantia > 0 ? getSaldo()+quantia : getSaldo());

         //Se quantia for maior que zero (saldo)recebe a soma da quantia do deposito + saldo. CASO NÃO. RECEBE SÓ O SALDO

     }

     public void setNumero(int num) {

          if (num > 0) {
               this.numero = num;
          }
     }

    public int getnumero() {

         return numero;
    }

     public String getTitular() {

         return titular;
     }

     public void setTitular(String titular) {

         this.titular = Objects.requireNonNull(titular);


     }

     public double getSaldo() {

          return this.saldo;
     }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Conta conta = (Conta) o;
//        return getnumero() == conta.getnumero(); //Se o numero for igual não adiciona
////        return getnumero() == conta.getnumero() && getTitular().equals(conta.getTitular()); // Se numero (&&) E nome titular for igual não adiciona.
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getnumero());
////        return Objects.hash(getnumero(), getTitular()); //Usar hash em caso de mais um parametro
//    }


    @Override
     public String toString() {

          return " Conta:  " +
                  "numero =" + getnumero()+
                  ", titular = " +getTitular() +
                  ", saldo =" + getSaldo();
     }

}