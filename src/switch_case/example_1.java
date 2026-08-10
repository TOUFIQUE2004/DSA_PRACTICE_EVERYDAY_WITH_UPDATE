package switch_case;

import java.util.Scanner;

public class example_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit =sc.next();
//        while (true){
            switch (fruit) {
                case "mango" -> System.out.println("king of fruits");
                case "apple" -> System.out.println("red fruit");
                case "banana" -> System.out.println("yellow fruit");
                case "tomato" -> System.out.println("it not a vegetable you idiot");
                case "pineapple" -> System.out.println("tropical fruit");
                default -> System.out.println("please enter a valid fruit");
            }
        }

    }
//}
