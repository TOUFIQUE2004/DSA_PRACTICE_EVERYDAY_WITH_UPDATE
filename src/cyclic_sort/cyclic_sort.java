package cyclic_sort;

import Arrays_ArrayList.reversal;

import java.util.Arrays;

public class cyclic_sort {
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
    }
    static void swap(int[] arr, int i, int j) {
        reversal.reverser.swap(arr, i, j);
    }
    public static void main(String[] args){
        int[] arr ={3,4,5,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
