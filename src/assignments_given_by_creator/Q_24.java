package assignments_given_by_creator;

import java.util.Scanner;

public class Q_24 {
    public void q_24() {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        num = sc.nextInt();

        while (num != 0) {
            sum = sum + num;   // Add the current number
            num = sc.nextInt(); // Read the next number
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Q_24 q = new Q_24();
        q.q_24();
    }
}
