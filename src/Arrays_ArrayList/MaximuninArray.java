package Arrays_ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

public class MaximuninArray {
    public static void main(String[] args) {
    int arr[]={1,3,5,7,3,6,7,4,6,8,9,11,789};
    int max=arr[0];
    int actual=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                actual = arr[i];

            }

        }
        System.out.println("The maximum value in the array is: " + actual);
    }


}
