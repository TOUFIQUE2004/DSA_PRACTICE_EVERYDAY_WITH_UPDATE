package intermediate;

import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {
        // Factorial Program In Java
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++){
          fact=fact*i;

        }
        System.out.println(fact);
    }
}
