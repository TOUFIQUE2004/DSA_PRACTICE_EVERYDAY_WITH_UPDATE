package QUESTIONS;

public class question_2 {
    public static void main(String[] args) {
        /*check whether a number is pallindrome or not i.e 1221=1221*/
        int num = 1221;
        int main_number=num;
        int ans = 0;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;

        }
        if(main_number==ans){
            System.out.println("Number is pallindrome");

        }
        else {
            System.out.println("Number is not pallindrome");
        }
    }
}
