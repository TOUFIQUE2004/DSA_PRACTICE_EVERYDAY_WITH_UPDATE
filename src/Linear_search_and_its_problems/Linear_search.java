package Linear_search_and_its_problems;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        boolean indexpresent=false;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x=in.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                indexpresent=arr[i]==x;
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
            System.out.println("Element not found in the array"+"\tAt pos "+index+indexpresent);
        }
        else{
            System.out.println("Element found at index: "+index);
        }
    }
}
