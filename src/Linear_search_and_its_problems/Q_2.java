package Linear_search_and_its_problems;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args){
        int target=2;
        int[] arr={1,2,3,4,5,6,4,5,3,7,3};
        for(int i=1;i<4;i++){
            if(target==arr[i]){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }

        }

    }
}
