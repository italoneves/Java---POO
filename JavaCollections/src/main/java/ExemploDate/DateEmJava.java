package ExemploDate;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEmJava {
    //TimeStamp, Date, SimpleDateFormat
    public static void main(String[] args) throws ParseException {

        Date data = new Date();  //Mostra hora atual pegando o milisegundo da hora que foi alocado

        System.out.println("Data atual normal: "+data);  // Tue Apr 06 15:50:02 BRT 2021 //data atual
        System.out.println("Data atual do PC em Millis: " + System.currentTimeMillis()); //Data atual em Millis

        Timestamp k= new Timestamp(1617737805794l); //Transformar a data  em milis para data normal
        System.out.println("Data normal após tranformar de Millis : "+k + "\n");

        //SimpleDateFormat pega em MillisSegundos
        //Transformar String em Data
        String s = "1998/02/16"; //DATA
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy/MM/dd"); // FORMATO QUE VOU RECEBER A DATA
        Date novaData = sDF.parse(s); // Converte String para Data


        //Converter para formato quer quero a data
        SimpleDateFormat sDF2 = new SimpleDateFormat("dd/MM/yyyy");
        String formatoEscolhido = sDF2.format(novaData);

        System.out.println("Data no formato escolhido: " + formatoEscolhido + "\n");


        System.out.println("Pegar data em MIllis: " + novaData.getTime()); // PEGAR EM MILLIS SEGUNDOS
        Timestamp b = new Timestamp(887598000000l);
        System.out.println("Printar millis -> data " + b);






    }

}
