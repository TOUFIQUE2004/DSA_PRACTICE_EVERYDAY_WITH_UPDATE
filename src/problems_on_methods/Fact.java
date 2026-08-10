package problems_on_methods;

import java.util.Scanner;

public class Fact {
    static int factorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int result = 1;
        while (n >=1) {
            result = result * n;
            n--;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
