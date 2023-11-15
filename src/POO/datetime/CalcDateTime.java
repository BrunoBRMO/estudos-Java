package POO.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcDateTime {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7); //Instanciado uma nova data d01 - 7 dias
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("pastWeekLocalDate: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekLInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);


        //Duração entre um espaço e medida determinados
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println("t1 dias: " + t1.toDays());

        //Para calcular o tempo de duração é necessario converter para LDTime ambos os argumentos
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atTime(0,0));
        System.out.println("t2 dias: " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d03);
        System.out.println("t3 dias: " + t3.toDays());

        //Tempo invertido
        Duration t4 = Duration.between(d03, pastWeekInstant);
        System.out.println("t4 dias: " + t4.toDays());
    }
}
