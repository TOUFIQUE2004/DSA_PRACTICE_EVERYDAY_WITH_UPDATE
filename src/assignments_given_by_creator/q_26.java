package assignments_given_by_creator;

import java.util.Scanner;

public class q_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to terminate):");

        while (true) {
            int number = sc.nextInt();

            if (number == 0) {
                break; // Stop reading input when 0 is entered
            }

            if (number < 0) {
                sumNegative += number;
            } else if (number % 2 == 0) {
                sumPositiveEven += number;
            } else {
                sumPositiveOdd += number;
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        sc.close();
    }
}