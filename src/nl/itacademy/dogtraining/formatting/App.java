package nl.itacademy.dogtraining.formatting;

import javax.sound.midi.Soundbank;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = now.format(dateTimeFormatter);

        System.out.println(formattedDateTime);


        dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println(now.format(dateTimeFormatter));

        // gmt

        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Europe/Amsterdam"));

        System.out.println(zonedDateTime.format(dateTimeFormatter));

        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_INSTANT));

        // NB: leg op de apostrof
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SX:00")));

        // the OFFICIAL ISO8601
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX:00")));

        // the official but now for our Austrial Buddies
        zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Australia/Perth"));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX:00")));

        // and for my nephews in New Zeeland
        zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Pacific/Auckland"));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX:00")));

        Instant newZeeland = LocalDateTime.now().toInstant(ZoneOffset.ofHours(12));

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Pacific/Auckland")));

        System.out.println(newZeeland);

        // and so on
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        // some time formatting

        LocalTime time = LocalTime.now();
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}