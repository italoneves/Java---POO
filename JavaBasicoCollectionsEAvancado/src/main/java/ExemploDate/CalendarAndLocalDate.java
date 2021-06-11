package ExemploDate;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarAndLocalDate {
    //Calendar é uma classe abstrata
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        System.out.println(agora.get(Calendar.DAY_OF_WEEK));
        //Sunday 1…Saturday 7 DOMINGO / SABADO

        //JAVA 8 LOCADATETIME

        System.out.println("\nLOCAL DATE");
        LocalDateTime dataAgora = LocalDateTime.now();
        System.out.println(dataAgora);
        LocalDateTime antes2meses = dataAgora.minusMonths(2);
        LocalDateTime depois2meses = dataAgora.plusMonths(2); // É imutavel(Não muda o valor da variavel original)
        System.out.println("Atual: " + dataAgora);
        System.out.println("Antes 2 meses: " + antes2meses);
        System.out.println("Depois2meses: " + depois2meses);

        String r = dataAgora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // "yyyy-MM-dd" Padrão do LocalDate - -
        //LocalDate.parse(r); //Tranformar para data //padrão é yyyy-MM-dd
        System.out.println("Dia da semana: "+dataAgora.getDayOfWeek()); //WEDNESDAY .PEGAR O DIA DA SEMANA



        //Client tem uma fatura para pagar com 10 dias após a data de vencimento, caso
        //caia no sabado ou domingo ele pode pagar na segunda, ver quantos dias ele tem para pagar

        System.out.println("Questão");
        LocalDate novo = LocalDate.of(2021,04,7);
        String nr = novo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Data formatada: " + nr);
        //Lista com sabado e domingo
        List lista;
        lista = new ArrayList<String>();
        lista.add("SUNDAY");
        lista.add("SATURDAY");

        LocalDate daquia10dias = novo.plusDays(10);//A data daqui a 10 dias vai ser essa data
        DayOfWeek d = daquia10dias.getDayOfWeek(); //pega dia da semana de acordo com a data, RETORNA UMA ENUM
        String s = d.name(); //Transformar enum para string

        int quantidadeDias = 10;
        if(lista.contains(s)){
            if (lista.get(0) == s){
                quantidadeDias++;
            }
            else quantidadeDias+=2;
        }
        System.out.println(quantidadeDias);




    }
}
