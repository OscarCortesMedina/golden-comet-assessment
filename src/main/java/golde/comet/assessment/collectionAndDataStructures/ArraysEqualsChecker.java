package golde.comet.assessment.collectionAndDataStructures;

import java.util.Arrays;

public class ArraysEqualsChecker {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(Arrays.equals(a, b));


        int[] c = {2, 2, 3};
        int[] d = {1, 2, 3};

        System.out.println(Arrays.equals(c, d));

    }
}
