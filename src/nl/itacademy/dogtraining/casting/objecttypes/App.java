package nl.itacademy.dogtraining.casting.objecttypes;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        demoInstanceOfCompileError();

    }

    private static void demoInstanceOfCompileError() {

        Cat c = new Cat();
//        if(c instanceof Dog) { // compile error!!!

//        }

//        if(c instanceof String) { // also a compile error!

//        }

    }

    public static void demoListMain() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Zebra());

        demoList(animals);
    }

    public static void demoList(List<Animal> animals) {

        for(Animal animal: animals) {
            animal.eat();
            if(animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
            else {
                if(animal instanceof Cat) {
                    Cat c = (Cat) animal;
                    c.miauw();
                }
                else {
                    if(animal instanceof Zebra){
                        Zebra z = (Zebra) animal;
                        z.yank();
                    }

                    
                }
            }
        }

    }

    public static void tooSimple() {
        Animal a = new Dog();

        if(a instanceof Dog) {

            Dog dog = (Dog) a;

            dog.bark();

        }
    }
}
