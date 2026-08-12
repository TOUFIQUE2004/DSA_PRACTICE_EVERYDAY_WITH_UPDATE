package Arrays_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lecture_02 {
    public static void main(String[] args) {
     // 3D ARRAY
      Scanner input = new Scanner(System.in);
        String[] string =new String[8];
        for(int i=0;i<string.length;i++){
            string[i]=input.next();
        }
        for(String i:string){
            System.out.print("[ ,"+i+" ]");
        }

        }

}
