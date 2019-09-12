package nl.itacademy.ocp.lambdas.reduce;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Credits: https://www.baeldung.com/java-stream-reduce
public class App {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        Assert.assertEquals(21, result);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Natasja", "Pieter", "Mick", " Francien", "Indi", "Nico"));

        String firstLettersOfGroup = names
                .stream()
                .reduce("", (sub, element) -> {

            return sub+element.charAt(0);
        });

        System.out.println(firstLettersOfGroup);

        int sumOfOdds = numbers
                .stream()
                .filter(n -> n %2  != 0)
                .reduce(3, (sub, element) -> {
                    int adder = (int) (Math.pow(sub + element, 2));
                    System.out.println(adder);

                    return adder;
                });

        System.out.println(sumOfOdds);
    }
}
