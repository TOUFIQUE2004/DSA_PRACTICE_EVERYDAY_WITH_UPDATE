package Binary_search;

public class find_no_of_Rot {
    public static void main(String[] args){
        int count=0;
        int nums[]={3,4,5,1,2};
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        System.out.println(countRotations(nums));
        System.out.println(countRotation(nums));
    }
    static int countRotations(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
    static int countRotation(int[] nums) {

        int minIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

}
