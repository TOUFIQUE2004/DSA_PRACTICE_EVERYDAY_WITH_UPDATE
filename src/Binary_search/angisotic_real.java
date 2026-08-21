package Binary_search;
import java.util.*;
public class angisotic_real {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element of the array at the position"+i);
            arr[i]=in.nextInt();
        }
        System.out.println("enter the element you want to find");
        int ele=in.nextInt();
        boolean ispresent=agiostic(arr,ele);
        System.out.println(ispresent);
        System.out.print(ele+"\n is the element to be found:......");

    }
    static boolean isAscending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static boolean agiostic(int[] arr,int ele){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            boolean rm=isAscending(arr);
            if(rm){
                if(arr[mid]==ele){
                    return true;
                }
                else if(arr[mid]>ele){
                    end=mid-1;
                }
                else if(arr[mid]<ele){
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]==ele){
                    return true;
                }
                else if(arr[mid]>ele){
                    start=mid+1;
                }
                else if(arr[mid]<ele){
                    end=mid-1;
                }

            }
        }
        return false;
    }
}
