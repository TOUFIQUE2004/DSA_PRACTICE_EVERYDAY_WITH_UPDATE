package sorting_techniques;
import java.util.Arrays;

import Arrays_ArrayList.reversal;

public abstract class bble_sort_2 {
    public static void sort1(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    reversal.reverser.swap(arr, i, j);
                }
            }
        }
    }
    public static void main(String[] abcd){
        int[] mer={-1,4,5,6,23,11};
        sort1(mer);
        System.out.println(Arrays.toString(mer));

    }

}
