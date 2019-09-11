package nl.itacademy.dogtraining.sorting.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(-10, 12, 5, 3, 24, 0));

        // array
//        int[] array = {0,1,2,3};

        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        // reverse sort
        Collections.sort(numbers, (a,b) -> {
            return b-a;
        });

        Collections.reverse(numbers);

        Collections.shuffle(numbers);

        System.out.println(numbers);

        numbers.stream().filter(n -> n > 0).forEach(System.out::println);

        List<Motorbike> motors = new ArrayList<>();
        motors.addAll(Arrays.asList(new Motorbike(), new Motorbike(), new Motorbike()));

        Collections.sort(motors, (motor1, motor2) -> motor1.getCc() - motor2.getCc());

        System.out.println(motors);
    }
}


class Motorbike {
    private int cc = (int) (Math.random() * 1000 +50);

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "cc=" + cc +
                '}';
    }
}