package Binary_search;

import java.util.Random;

public class array_of_size_infininity {
    public static void main(String[] args){
        int nums[]= new int[1000];

        // Generating 1000 random integer values
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1000);

            // Generates random values between 0 and 999
        }

        int target=56;
        int ans=findingrange(nums,target);
        System.out.println(ans);
    }
    public static int findingrange(int[] arr, int target){
        //first find the range with box of size 2
        int start=0;
        int end=1;
        while(target>end){
            end=end+(end-start+1)*2;
            start=end+1;
        }
        return binary_search(arr,start,end,target);
    }
    public  static int binary_search(int[] nums,int target,int start,int end){

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}