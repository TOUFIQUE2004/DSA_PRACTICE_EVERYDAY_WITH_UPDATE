package switch_case;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount of money you have");
        int money=sc.nextInt();
        switch (money){
            case 1000 ->{
                System.out.println("enter daily_income:-");
                int daily_income=sc.nextInt();
                switch (daily_income){
                    case 100,200,300,400 -> System.out.println("you can buy a horse if you want");
                }
            }
            case 100000 ->{
                System.out.println("enter your daily income:-");
                int dailyincome=sc.nextInt();
                switch (dailyincome){
                    case 1000,2000,3000,4000 -> System.out.println("you can buy a car if you want");
                }
            }
            case 1000000 ->{
                System.out.println("enter your monthly income:-");
                int monthlyincome=sc.nextInt();
                switch (monthlyincome)
                {
                    case 1000000 ->System.out.println("you can buy anything");  }
                }

            }
        }
    }

