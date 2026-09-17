package String;

import java.util.ArrayList;

public class prettyprinting {
    public static void prettyprint(float f) {
      System.out.printf("upto %.2f",f);

    }
    public static void main(String[] args) {
//        float m=1243234324343242323421342341.34212341234f;
//        float f1=0.5f;
//        float num=1234.567895f;
//        System.out.printf("this is pretty printing %.2f",num);
//        System.out.println(                                                                        );
//        prettyprint(m);
//        System.out.println();
//
//        prettyprint(f1);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Float> list1=new ArrayList<>();
        ArrayList<Double> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<String> list4=new ArrayList<>();
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+2);
        System.out.println((char)('a'+2));
        System.out.println("a"+3);
        System.out.println("a"+new ArrayList<>());
        System.out.println("a"+new ArrayList<Integer>());
        System.out.println("a"+new ArrayList<Float>());
        System.out.println("a"+new ArrayList<Double>());
        System.out.println("a"+new ArrayList<String>());
        System.out.println(Math.PI);

    }
}
