package String;
import java.util.Arrays;
public class first {
    public static void main(String[] args) {
        String str="toufique";
        int[] nums=new int[str.length()];
        System.out.println(str);
        String str1="toufique";
        System.out.println(str1==str);
        String str3=new String("toufique");
        String str4 =new String("toufique");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    nums[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
