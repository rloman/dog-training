package nl.itacademy.dogtraining.formatting.stringformatting;

public class App {

    public static void main(String[] args) {

        String zin = "Die hond heet %2s en kost maar %4d .%n";

        System.out.printf(zin, "Dexter", 5000);

        System.out.printf(zin, "Mickey", 1000001000);

        System.out.printf(zin, "Wodan", 120);


    }
}
