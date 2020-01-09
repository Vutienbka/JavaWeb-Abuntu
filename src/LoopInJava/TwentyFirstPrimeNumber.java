package LoopInJava;

public class TwentyFirstPrimeNumber {
    public static void main(String[] args) {
        int count =0;
        for(int i= 0; ;i++){
            if(isPrimeNumber(i)==true){
                System.out.print(i +" ");
                count ++;
                if(count == 20)
                    break;

            }

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
