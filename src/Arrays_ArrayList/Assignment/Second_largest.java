package Arrays_ArrayList.Assignment;

import java.util.Arrays;

public class Second_largest {
    public static void main(String[] args) {
        int arr[]={10,2,3,4,5,7,4,9,3};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]>second_largest && arr[j]!=largest){
                    second_largest=arr[j];
                    break;
                }
            }

        }
        System.out.println("Second largest element is: "+second_largest);
    }

}
