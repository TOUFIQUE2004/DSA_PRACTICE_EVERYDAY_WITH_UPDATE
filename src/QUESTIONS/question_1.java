package QUESTIONS;

public class question_1 {
    public static void main(String[] args) {
        /*Count Digits in a Number:
        Given an integer,
        write a program using a while loop to count how many digits it contains.
        Example: Input: 4562 $\rightarrow$ Output: 4.*/
        int num=456745;
        int count=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            count++;

        }
        System.out.println(count);
    }
}
