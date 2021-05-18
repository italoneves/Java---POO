package JavaAvancado.Threads;

public class Exemplo2Thread {
    public static void main(String[] args) {

        Pdf p = new Pdf();
        Loading l = new Loading(p);
        p.start();
        l.start();
    }

}

class Pdf extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Construindo PDF");
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pdf construido");;
    }
}
class Loading extends Thread{

    private Thread pdf;
    public Loading(Thread p) {
        this.pdf = p;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4);
            while (true){
                if(!pdf.isAlive()){
                    break;
                }
                System.out.println("Loading...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}