package nl.itacademy.ocp.lambdas.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Credits (en mooie demo voorbeelden): => https://www.concretepage.com/java/jdk-8/java-8-stream-collect-example
public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21)); //54

        Bucket<Integer> result = numbers.stream().collect(Bucket::new, Bucket::add, (left, right) -> left.addAll(right));

        System.out.println("Final result:"+result);

        List<Integer> squares = numbers
                .stream()
                .map(n -> n * n).collect(Collectors.toList());

        System.out.println(squares);
    }

}

class Bucket<T> {
    private List<T> content = new ArrayList<>();

    public boolean add(T t) {

        System.out.println("Adding "+t);
        this.content.add(t);

        return true;
    }

    public boolean addAll(Bucket<T> collection) {

        System.out.println("Adding collection: "+collection);
        this.content.addAll(collection.content);
        System.out.println("Collection added, collection is now: => "+this.content);

        return true;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "content=" + content +
                '}';
    }
}