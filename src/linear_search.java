import java.util.ArrayList;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());

        }
        System.out.println("Enter the element to be searched: ");
        int x=sc.nextInt();
        int index=0;
        for(int i=0;i<arr.toArray().length;i++){
            if(arr.get(i)==x){
                index=i;
            }

        }
        System.out.println("Element not found in the array"+"\tAt pos "+index);
    }
}
