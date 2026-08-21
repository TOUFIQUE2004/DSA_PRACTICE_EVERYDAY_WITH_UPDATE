package Binary_search;

import java.util.Scanner;

public class angiostic_binary_search {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the number"+(i+1)+"at the position");
            arr[i]=sc.nextInt();

        }
        binarySearch(arr,0,n-1);
        binary(arr,5);
   }
   public static int binarySearch(int[] arr,int a,int b){
       int low=a,high=b-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==b){
               return arr[mid];
           }
           else if(arr[mid]>b){
               high=mid-1;
           }
           else if(arr[mid]<b){
               low=mid+1;
           }
           else{
               return -1;
           }
       }
       return -1;
   }
   public static int binary(int[] arr,int a){
       int low=0;
       int high=arr.length-1;
       while(low<=high){
           int mid=low+(high-low);
           if(a>arr[mid]){
               high=mid-1;
           }
           if(a<arr[mid]){
               low=mid+1;
           }
       }
       return -1;
   }
}
