package problems_on_methods;

public class Prob1 {
    //Define two methods to
    // print the maximum and the
    // minimum number respectively among
    // three numbers entered by the user.
    public static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));

    }
    public static int max(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int c=11;
        int minimum=min(a,b,c);
        int maximum=max(a,b,c);
        System.out.println(minimum);
        System.out.println(maximum);

    }
}
