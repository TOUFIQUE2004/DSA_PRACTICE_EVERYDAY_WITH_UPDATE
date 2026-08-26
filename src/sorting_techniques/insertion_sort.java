package sorting_techniques;
import Arrays_ArrayList.reversal;

import java.util.*;

public class insertion_sort {

    // Corrected swap method using indices and array reference
    static void swap(int[] arr, int i, int j) {
        reversal.reverser.swap(arr, i, j);
    }

    static int[] insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // Pass indices (j and j-1), not element values
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 34, 2, 3, 2, 3, 2, 3, 2, 3};
        int[] sorted = insertionsort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}