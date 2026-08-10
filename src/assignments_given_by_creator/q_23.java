package assignments_given_by_creator;
/*Input a number and print all the factors of that number (use loops).*/
import java.util.ArrayList;
import java.util.Scanner;

public class q_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> fact=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" is factor of "+num);
                fact.add(i);
            }
        }
        System.out.println("Factors of "+num+" are: "+fact);
    }
}


