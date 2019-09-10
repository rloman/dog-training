package nl.itacademy.dogtraining.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {

        // vandaag, heden
        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate myBirthDate = LocalDate.of(1968, 8, 9);
//        LocalDate nonsense = new LocalDate(); // vout

        System.out.println(myBirthDate);

        LocalDate threeMonthPLus3Days = LocalDate.now().minusMonths(3).plusDays(3);
        System.out.println(threeMonthPLus3Days);

        Period period = Period.between(threeMonthPLus3Days, LocalDate.now());

        System.out.println(period);

        Period myPeriod = Period.between(myBirthDate, today);

        System.out.println(myPeriod);

        System.out.println(myPeriod.getYears());

        long daysOfRaymie = ChronoUnit.DAYS.between(myBirthDate, today);

        System.out.println(daysOfRaymie);

        long months = ChronoUnit.MONTHS.between(myBirthDate, today);
        System.out.println(months);


//        long seconds = ChronoUnit.SECONDS.between(myBirthDate, today); // runtime exception
//        System.out.println(seconds);


    }
}
