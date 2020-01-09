package LoopInJava;

public class primeNumberLessThanHundred {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            if(isPrimeNumber(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrimeNumber(int n){
        if(n <2)
            return false;
        if(n==2)
            return true;

        for (int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
