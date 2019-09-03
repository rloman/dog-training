package nl.itacademy.dogtraining.designpatterns;

import nl.itacademy.dogtraining.designpatterns.factory.Animal;
import nl.itacademy.dogtraining.designpatterns.factory.Food;
import nl.itacademy.dogtraining.designpatterns.factory.FoodFactory;
import nl.itacademy.dogtraining.designpatterns.factory.Hay;

public class App {

    public static void main(String[] args) {
        Animal jollyJumper = new Animal();

        Food eten = FoodFactory.getFood(jollyJumper);

        System.out.println(eten.getClass());

//        Hay voetje = new Hay();
    }
}
