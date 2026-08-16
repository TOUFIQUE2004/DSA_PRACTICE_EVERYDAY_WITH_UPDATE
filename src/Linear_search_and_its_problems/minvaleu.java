package Linear_search_and_its_problems;

import java.util.Arrays;

public class minvaleu {
    public static void main(String[] args) {
        int pos=0;
        int[] arr={1,4,56,7,9,3};
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                pos=arr[i-1];
                break;
            }

        }
        System.out.println(pos);
        System.out.println(min(arr));
        System.out.println(Arrays.toString(arr));

    }
    static int min(int[] arr){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];

            }
        }
        return mini;
    }
}
