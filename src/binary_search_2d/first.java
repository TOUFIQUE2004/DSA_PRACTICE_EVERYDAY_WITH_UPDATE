package binary_search_2d;
import java.util.*;
public class first {
    public static void main(String[] args) {
        //int mat={{10,20,30,40},{15,25,35,45},{28,29,32,39}};
        int[][] mat = {
                {  1,  3,  5,  7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target=34;
        int[]result=search(mat,target);
        System.out.println(Arrays.toString(result));
    }
public static int[] search(int[][] mat,int target){
        int[] result={-1,-1};
        //int ansrow=-1;
        //int anscol=-1;
        int row=0;
        int col=mat.length-1;
        while(row <mat.length && col>=0){
            if(mat[row][col]==target){
                //ansrow=row;
                //anscol=col;
                result[0]=row;
                result[1]=col;
                return result;

            }
            else if(mat[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return result;
}
}

