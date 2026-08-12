package Arrays_ArrayList;
import java.util.*;
public class q_1 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i*i;
        }
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
