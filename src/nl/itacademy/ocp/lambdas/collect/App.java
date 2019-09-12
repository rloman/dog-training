package nl.itacademy.ocp.lambdas.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21)); //54

        // assignment
        // use lambda
        // reduce


        // Iets als dit!!!
        /*
        numbers.stream().collect(ArrayList::new, List::add, (left, right) -> {
            left.addAll(right);

            return left;
        });
        */

        List<Integer> squares = numbers
                .stream()
                .map(n -> n *n ).collect(Collectors.toList());

        System.out.println(squares);

    }
}
