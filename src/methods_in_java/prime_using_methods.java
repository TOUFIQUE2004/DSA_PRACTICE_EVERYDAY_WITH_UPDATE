package methods_in_java;

public class prime_using_methods {
    static boolean isPrime(int n) {
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;

    }
        public static void main (String[] args){
            int a = 15;
            boolean isp = isPrime(a);
            System.out.println("the number " + a + " is prime:-" + isp);
        }
    }
