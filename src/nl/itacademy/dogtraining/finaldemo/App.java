package nl.itacademy.dogtraining.finaldemo;

import nl.itacademy.dogtraining.model.Dog;

public class App {

    public static void main(String[] args) {

        foo();

        bar();
    }

    public static void foo() {

        final double PI = 3.1415926;

        System.out.println(PI);



    }

    public static void bar() {
        final Dog d = new Dog("Wodan", false);
//        d = new Dog("X", true);
        d.setMale(true);
//        d.setBreed(null);
    }
}
