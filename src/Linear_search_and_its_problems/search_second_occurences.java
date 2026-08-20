package Linear_search_and_its_problems;

import java.util.Arrays;
/*Level 2 — Medium

5. Find the second occurrence

Given an array and a target, find the index of the second occurrence.*/
public class search_second_occurences {
    public static void main(String[] args){
        int arr[]={1,2,3,3,5,7,9,9};
        int tar=9,count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar && arr[i]==arr[i+1]) {
                count = i + 1;
                break;
            }
        }
        System.out.println(count);
    }

}
