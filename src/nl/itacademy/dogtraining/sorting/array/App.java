package nl.itacademy.dogtraining.sorting.array;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] numbers = new int[]{13,5,9,4,2,128,-10};

        Arrays.sort(numbers);

       for(int element: numbers) {
           System.out.print(element+", ");
       }
    }
}
