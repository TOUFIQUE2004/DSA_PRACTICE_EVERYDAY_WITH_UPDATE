package Arrays_ArrayList;
import java.util.ArrayList;
public class arraylist01 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>(10);
    for(int i=0;i<10;i++){
        num.add(i);
    }
     int n=num.size();
    boolean b=num.contains(5);
        System.out.println(b);
        System.out.println(num.isEmpty());

        System.out.println(num.toString());
        System.out.println(num.size());
    }

}
