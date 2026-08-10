package QUESTIONS;

public class TalentNext {
    public void calculateKey(int input1, int input2, int input3){
        int key1=input1/1000;
        int key2=(input2/100);
        int key3=0;
        int smallest=9;
        int temp=input3;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            temp /= 10;
        }
        System.out.println((key1*key2)+smallest);
    }

    public static void main(String[] args) {
        //Given three four-digit positive integers—input1,
        // input2, and input3 (each ranging from $1000$ to
        // $9999$)—write a function to calculate a numerical key
        // based on the following rules:Extract the first digit (thousands digit) of
        // input1.Extract the hundreds digit of input2.
        // Find the smallest digit present in input3.
        // The key is computed using the formula:$$\text{Key} = (\text{First Digit of } \text{input1} \times \text{Hundreds Digit of } \text{input2}) +
        // \text{Smallest Digit of } \text{input3}$$//
        TalentNext tn=new TalentNext();
        tn.calculateKey(1222,2345,5678);

    }
}
