package methods_in_java;

import java.util.Scanner;

public class String_return {
    public static void main(String[] args) {
       String result=Str();
       System.out.println(result);
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
    protected static String Str(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:-");
        String st=sc.next();
        if(st.equals("port mafia")) return "man of m";
        else if(st.equals("soldier")) return "man of s";
        else if(st.equals("assassin")) return "man of a";
//        else if(st.equals("thief")) return "man of respect";
//        else if(st.equals("hacker")) return "man of respect";
//        else if(st.equals("spy")) return "man of respect";
//        else if(st.equals("detective")) return "man of respect";
//        else if(st.equals("police")) return "man of respect";
//        else if(st.equals("mafia")) return "man of respect";
//        else if(st.equals("gangster")) return "man of honor";
        else return "man of respect";
    }
}
