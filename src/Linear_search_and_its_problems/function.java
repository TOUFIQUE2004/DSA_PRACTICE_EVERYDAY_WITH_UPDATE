package Linear_search_and_its_problems;

public class function {
    public  static int linear_search(int[] arr,int x){
        int target=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    target=i;
                }
            }
        return target;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,24,2,5,6,7,8,9,10};
        int tar=5;
        int num=linear_search(arr1,tar);
        System.out.println(num+"\t is the position of is the element in the array \t"+tar);

    }
}
