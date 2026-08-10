package REVISION;

public class questions_revise {
    public static void main(String[] args) {
        //find the reverse of a number//
        int num=121;
        int ans=0;
        int copy=num;
        int count=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            ans=ans*10+rem;
            count++;

        }
        System.out.println(ans);
        System.out.println(count);
        if(ans==copy){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }

}
