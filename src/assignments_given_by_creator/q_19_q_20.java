package assignments_given_by_creator;

import java.util.Scanner;

public class q_19_q_20 {
    public static int summation(int a,int b){
        return a+b;
    }
//    interface remote(int man,int women){
//
//    }
    public static int gcd(int a,int b){
        int temp=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0) temp=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    }
