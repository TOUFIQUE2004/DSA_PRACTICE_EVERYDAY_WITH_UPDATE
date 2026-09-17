package String;

public class pallindrome {
    public static boolean isPalindrome(String s) {
        String res = s.replace(" ", "");
        int start=0;
        int end=res.length()-1;
        while(start<=end){
            if(res.charAt(start)!=res.charAt(end)) return false;
            start++;
            end--;

        }
        return false;

    }
    public static void main(String[] args) {
        String st="makaut";
        String mn="manam";
        boolean bo=isPalindrome(st);
        System.out.println(bo);
        System.out.println(isPalindrome(st));
        System.out.println(isPalindrome(mn));
        System.out.println(isPalindrome(mn));

    }
}
