package intermediate;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
//ARMSTRONG NUMBER
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int arm=0;
        int temp=num;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=num;
        while(temp>0){
            int rem=temp%10;
            arm+=(int)Math.pow(rem,count);
            temp=temp/10;
        }
        if(arm==num){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}
