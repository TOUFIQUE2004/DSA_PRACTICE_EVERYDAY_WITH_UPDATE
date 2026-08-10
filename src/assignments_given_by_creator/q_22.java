package assignments_given_by_creator;

import java.util.Scanner;

public class q_22 {
    /*22. [Subtract the Product and Sum of Digits of an Integer]* ex:-234 so 2*3*4=24 and 2+3+4=9, so 24-9=15
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;

        while(num != 0) {
            int rem = num % 10;
            product *= rem;
            sum += rem;
            num = num / 10;
        }

        System.out.println("Product: " + product);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + (product - sum));
    }
}
