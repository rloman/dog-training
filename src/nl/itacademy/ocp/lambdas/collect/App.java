package nl.itacademy.ocp.lambdas.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Credits (en mooie demo voorbeelden): => https://www.concretepage.com/java/jdk-8/java-8-stream-collect-example
public class App {

    /*

     Stream<String> stream = Stream.of("w", "o", "l", "f");

        //collect it to a Stringbuilder e.g.
//    stream.collect(supplier, appender, merger)
        // first ... create a StringBuilder
        // second ... append the intermediate result to the Stringbuilder
        // last ... merge all the result of the intermediate to the StringBuilder using
        StringBuilder wordBuilder = stream.collect(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);

        System.out.println(wordBuilder.toString());
     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21)); //54

        // Iets als dit!!!
        numbers.stream().collect(ArrayList::new, List<Integer>::add, (left, right) -> {
            left.addAll(right);

            return left;
        });

        List<Integer> squares = numbers
                .stream()
                .map(n -> n *n ).collect(Collectors.toList());

        System.out.println(squares);

    }
}
