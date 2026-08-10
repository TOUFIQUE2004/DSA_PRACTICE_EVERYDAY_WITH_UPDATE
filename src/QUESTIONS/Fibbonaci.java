package QUESTIONS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of fibbonaci terms:-");
        int a=sc.nextInt();
        int first_term=0;
        int second_term=1;
        System.out.println(first_term);
        System.out.println(second_term);
        for(int i=0;i<=a;i++){
            int nextterm=0;
            //add the intial two terms and then change them
            nextterm=first_term+second_term;
            //interchange the numbers

            first_term=second_term;
            second_term=nextterm;
            System.out.println(nextterm);
            int final_result=nextterm;
        }


//


    }
}
