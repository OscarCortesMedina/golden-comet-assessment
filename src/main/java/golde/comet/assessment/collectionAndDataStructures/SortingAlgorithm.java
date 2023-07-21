package golde.comet.assessment.collectionAndDataStructures;


import java.util.Arrays;

public class SortingAlgorithm {

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Before Sorting");
        Arrays.stream(array).forEach(n->System.out.print(n+" "));
        System.out.println();
        bubbleSort(array);
        System.out.println("After Sorting");
        Arrays.stream(array).forEach(n->System.out.print(n+" "));
    }

    // bubble sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
