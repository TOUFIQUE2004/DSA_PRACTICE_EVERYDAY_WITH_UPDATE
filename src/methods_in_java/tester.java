package methods_in_java;

import java.lang.reflect.Array;
import java.util.*;

public class tester {
    public static void arms(int[] nums){
        nums[0]=100;
        nums[1]=200;
        nums[3]=300;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        arms(arr);
        System.out.println("after running the function:-"+ Arrays.toString(arr));
        int[] arr1={1,2,3,4,5};
        change(arr1);
        System.out.println("after changing the function:-"+ Arrays.toString(arr1));

    }
    public static void change(int[] arr){
        Scanner sc=new Scanner(System.in);
        arr[0]=sc.nextInt() + 1;
        arr[1]=sc.nextInt()+2;
        arr[2]=sc.nextInt()+3;
        arr[3]=sc.nextInt()+4;
        System.out.println("after changing the array:-"+Arrays.toString(arr));
    }
}
