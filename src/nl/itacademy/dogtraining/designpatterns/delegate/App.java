package nl.itacademy.dogtraining.designpatterns.delegate;

public class App {

    public static void main(String[] args) {
        Egg e = new Egg();

        Eggbox b = new Eggbox();
        b.add(e);
    }
}
