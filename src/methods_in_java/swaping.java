package methods_in_java;

public class swaping {
    public static void main(String[] args) {
        int a=100;
        int b=11;
        swap(a,b);
        System.out.println("after swapping a="+a+" b="+b);

    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
