import java.sql.SQLOutput;
import java.util.Scanner;

public class Upper_case_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character for checking you can enter string as well:-");
        char ch=sc.next().trim().charAt(0);
        if(ch >'A' && ch<'Z'){
            System.out.println("the char is upper case");
        }
        else if(ch>'a' && ch<'z'){
            System.out.println("the char is lower case");
        }
        else if(ch>=0 && ch<=9){
            System.out.println("the char is not a number");
        }
        else{

            System.out.println("the char is special character");
        }


    }
}