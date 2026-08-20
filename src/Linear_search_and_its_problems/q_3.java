package Linear_search_and_its_problems;

import java.util.Arrays;
import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
//Find the first element greater than X
        int[] arr={1,2,3,2,4,2,4,11,5,6,77,8,22};
        int x=99,count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count=i;
                x=arr[i];
                break;


            }
            else{
                System.out.println("no element in the array found");
            }
        }
        System.out.println(count +" \t is the position  and the elemt is "+x);
        System.out.println(Arrays.toString(arr));
    }
}
