package Maths_for_dsa;

public class elementappearsoncce {
    public static void main(String[] args){
        int[] arr={-1,1,1,1,2,2,2,3,3,3,4};
        int[] count=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i+" appears "+count[i]+" times");
            }
        }
    }
}
