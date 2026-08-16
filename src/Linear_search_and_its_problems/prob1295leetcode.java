package Linear_search_and_its_problems;

public class prob1295leetcode {
    public static boolean checknum(int num){
        int counter=0;
        while(num>0){
        num=num/10;
        counter++;
        }
        return counter%2==0;
    }
    public static int check(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(checknum(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,11,15,16,18,21,121};
        System.out.println(check(arr));

    }
}
