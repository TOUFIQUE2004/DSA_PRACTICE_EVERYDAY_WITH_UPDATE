package Linear_search_and_its_problems;

import java.util.Arrays;
import java.util.Scanner;

public class check_frequency {
    public static int freq(int a){
        int[] arr=new int[100];
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,3,2,4,2,4,5};
        int count=0,ele=0;
        for(int i=1;i<arr.length;i++){
            if(freq(arr[i-1])>freq(arr[i])){
                count=freq(arr[i-1]);
                ele=arr[i-1];
            }
        }
        System.out.println("the no of times "+ele+" occurs is "+count);

    }
}
