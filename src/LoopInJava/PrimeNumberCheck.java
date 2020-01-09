package LoopInJava;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = scanner.nextInt();
        if (isPrimeNumber(num) == false)
            System.out.println(num + " is NOT prime number");
        else
            System.out.println(num + " is Prime number");
    }

   public static boolean isPrimeNumber(int n){
        if(n <2)
            return false;
        if(n==2)
            return true;
        for (int i = 2; i< Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

}
