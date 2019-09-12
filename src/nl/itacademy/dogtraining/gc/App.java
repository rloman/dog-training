package nl.itacademy.dogtraining.gc;

public class App {

    public static void main(String[] args) throws InterruptedException {

        foo();

        // hier zou rocket moeten worden opgeruimd

        for(int i = 0;i<10000;i++) {
            Rocket r = new Rocket();
            r.fire();
        }


        System.gc();
        Thread.sleep(3000);

    }

    public static void foo() {
       Rocket rocket = new Rocket();
       rocket.fire();
    }


}
