package String;

import java.util.Arrays;

public class vowels {
    public static void main(String[] args) {
        String str="hello world";
        int count=0;
        String[] string=str.split(" ");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }

        }
        System.out.println(count);
        System.out.println(Arrays.toString(string));
    }
}
