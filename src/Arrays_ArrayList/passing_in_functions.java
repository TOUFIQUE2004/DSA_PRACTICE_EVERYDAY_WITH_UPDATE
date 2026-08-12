package Arrays_ArrayList;

import java.util.Scanner;

public class passing_in_functions {
    public static void worked(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println("\n");
        }

    }
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }

        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i+1][j+1]>arr[i][j]){
                    arr[i][j]=0;

                }
            }
        }
        worked(arr);


    }
}
