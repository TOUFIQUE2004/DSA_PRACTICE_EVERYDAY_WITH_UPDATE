package Binary_search;
import java.util.*;
public class simple_binary_search {
    public static void main(String[] args) {
        int[] num={1,3,4,2,4,2,4,5,3,4,7,9};
        int target=9;
        Arrays.sort(num);
        int ans=binary(num,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(num));
    }
//    public static int binary_search(int[] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]<target){
//                start=mid+1;
//            }
//            else if(arr[mid]>target){
//                end=mid-1;
//            }
//            else{
//                return mid;
//            }
//
//        }
//        return -1;
//    }

    public static int binary(int[] arr,int target){
        if(arr==null||arr.length==0){
            return -1;
        }
        int  start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

