package golde.comet.assessment.numbers;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxAndMaxOf2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("max: "+Arrays.stream(numbers).max().getAsInt());
        System.out.println("min: "+Arrays.stream(numbers).min().getAsInt());

    }


}
