package POO.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Format {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Recebendo o fuso horario do computador do usuario, pois o Instant precisa ser informado do fuso horario
        // para formatar
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01 no format: " + d01);
        System.out.println("d01 custom format: " + d01.format(fmt1));
        System.out.println("d01 custom format 2: " + fmt1.format(d01));
        System.out.println("d01 custom format 3: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d02: " + d02.format(fmt1));
        System.out.println("d02: " + d02.format(fmt2));

        System.out.println("d03: " + fmt3.format(d03)); //chamar o instant com formato customizado
    }
}
