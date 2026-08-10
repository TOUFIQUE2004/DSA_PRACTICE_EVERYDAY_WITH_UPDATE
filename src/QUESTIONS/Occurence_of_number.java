package QUESTIONS;

public class Occurence_of_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,13,5,7,4,5,5,2,4,5,9,34,2,3};
        int target=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;

            }
        }
        System.out.println("The number "+target+" occurs "+count+" times in the array.");
    }
}
