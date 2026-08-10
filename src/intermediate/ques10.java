package intermediate;

import java.util.Scanner;

public class ques10 {
    static void pall(int n){
        int nem=0;
        int original=n;
        if(n<0){
            System.out.println("It is not a considered number");
            return;
        }
        while(n>0){
            int rem=n%10;
            nem=nem*10+rem;
            n=n/10;

        }
        if(nem==original){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=1;
        while(num!=0){
            System.out.println("\nenter a number for checking if it is pallindorme:-\t");
            int n=sc.nextInt();
            pall(n);
        }


    }
}
