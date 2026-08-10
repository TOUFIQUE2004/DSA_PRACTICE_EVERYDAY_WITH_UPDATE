package problems_on_methods;

import java.util.Scanner;

public class prob12 {
    static int pythagoras(int a, int b, int c) {
        if (a * a + b * b == c * c && a * a == b * b + c * c && a * a == b * b + c * c) {
            System.out.println("Acute angled triangle");
        } else if (a * a + b * b > c * c) {
            System.out.println("Obtuse angled triangle");
        } else {
            System.out.println("Right angled triangle");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c= input.nextInt();
        pythagoras(a,b,c);

    }
}
