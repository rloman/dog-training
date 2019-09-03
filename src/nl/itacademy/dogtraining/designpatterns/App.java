package nl.itacademy.dogtraining.designpatterns;

import nl.itacademy.dogtraining.designpatterns.factory.Food;
import nl.itacademy.dogtraining.designpatterns.factory.FoodFactory;
import nl.itacademy.dogtraining.designpatterns.factory.Horse;

public class App {

    public static void main(String[] args) {
        Horse jollyJumper = new Horse();

        Food eten = FoodFactory.getFood(jollyJumper);

        System.out.println(eten.getClass());
    }
}
