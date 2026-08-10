package problems_on_methods;

public class prob2 {
    public static void marks(int mark) {
        if (mark >= 91 && mark <= 100) {
            System.out.println("AA");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("AB");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("BB");
        } else if (mark >= 61 && mark <= 70) {
            System.out.println("BC");
        } else if (mark >= 51 && mark <= 60) {
            System.out.println("CD");
        } else if (mark >= 41 && mark <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        marks(91);
        marks(81);
        marks(71);
        marks(61);
        marks(51);
        marks(41);


        }
        /*Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */
    }

