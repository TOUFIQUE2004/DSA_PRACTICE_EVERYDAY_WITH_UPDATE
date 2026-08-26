package sorting_techniques;

import Arrays_ArrayList.reversal;

import java.util.Arrays;

public class selection_sort{
    public static void swap(int[] arr, int i, int j){
        reversal.reverser.swap(arr, i, j);
    }
    public static int indexfind(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
        }
        }
        return max;
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int end=arr.length-i-1;
            int maxindex=indexfind( arr,0,end);
            swap(arr,maxindex,end);
        }
    }
    public static void main(String[] args){
        int[] arr={-1,3,4,5,23,4,2,3,2,3,21,8 ,9,20,67,78,64,5,5,43,5,3,5,4,56,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
