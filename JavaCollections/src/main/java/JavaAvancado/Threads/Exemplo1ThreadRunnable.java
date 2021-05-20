package JavaAvancado.Threads;

import static java.lang.Thread.*;

public class Exemplo1ThreadRunnable {

    public static Runnable pdf = new Runnable(){
        @Override
        public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Construindo PDF");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    };


    public static Runnable loading = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(4500);
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };


    public static void main(String[] args) {

        Thread tpdf = new Thread(pdf);
        Thread tloading = new Thread(loading);
        tpdf.start();
        tloading.start();
        while (true){
            if (!tpdf.isAlive()){
                tloading.interrupt();
                break;
            }

        }



    }

}
