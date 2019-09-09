package nl.itacademy.ocp.lambdas.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        System.out.println(Arrays.asList(data));
        stringStream.forEach(System.out::println);

        List<String> strings = stringStream.collect(Collectors.toList());

        System.out.println(strings);

        System.exit(0);

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

        // uitzoeken voor Stijn!!! (na de break) inclusief List::remove(Object)
        List<String> someNames = new ArrayList();

    }
}
