package POO.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instace {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); //Instanciar a data de agora
        LocalDateTime d02 = LocalDateTime.now(); //data e hora de agora
        Instant d03 = Instant.now(); //Data hora GMT(greenwich)

        LocalDate d04 = LocalDate.parse("2022-07-20"); //.parse para pegar um texto ISO e gerar uma data hora a
        // partir dele
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//horario de Londres 3 horas adiantado

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);//É necessario o formatter para o Java poder interpretar
        // o formato customizado
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); //devido ao horario um novo formatter é
        // necessario

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7 , 20, 1 ,30);

        System.out.println("d01: " + d01);//Ao chamar um objeto dentro de uma String ele tem .toString implicito
        System.out.println("d02: " + d02);//e por padrão, o .toString, ja coloca no padrão ISO
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d06: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);
    }
}
