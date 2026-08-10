package QUESTIONS;

public class q3 {
    public static void main(String[] args) {
        /*Write a program to check whether a given number N is prime or not using a loop.
        Try optimizing it so the loop runs at most $\sqrt{N}$ times.*/
        /*a number is called  prime only if it is divisible by 2 numbers 1 and itself*/
        int num=23;
        boolean isprime=false;
        for(int i=2;i<23;i++){
            if(num%i==0){
               isprime=true;
            }
            else{
                isprime=false;
            }
        }
        System.out.println(isprime);
    }
}
