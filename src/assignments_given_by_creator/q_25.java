package assignments_given_by_creator;

public class q_25 {
    public static void main(String[] args) {
        /*Kunal is allowed to go out with his friends only on the even days of a given month.
         Write a program to count the number of days he can go out in the month of August.*/
        int august=31;
        int count_days=0;
        for(int i=0;i<31;i++){
            if(i%2==0){
                count_days++;

            }
        }
        System.out.println(count_days);
    }
}
