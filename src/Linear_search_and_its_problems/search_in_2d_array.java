package Linear_search_and_its_problems;

public class search_in_2d_array {
    public static void main(String[] args) {
        boolean truth=false;
        int[][] arr=new int[][]{{1,2},{3,4},{5,6}};
        int target=3;
        for(int[] i:arr){
            for(int j:i){
                if(j==target){
                   truth=true;
                   break;
                }
            }
        }
        System.out.println(truth);
    }
}
