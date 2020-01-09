package LoopInJava;
import java.util.Scanner;

public class BankingInterestCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MILLION = 1000000;
        final int THOUSAND = 1000;

        System.out.println("Input deposit: ");
        long deposit = scanner.nextLong();
        System.out.println("Input interest rate: ");
        int interestRate = scanner.nextInt();
        System.out.println(" Input numbers of months: ");
        int numbersOfMonth = scanner.nextInt();
        long extraMoney = calculateInterestMoney(deposit,interestRate,numbersOfMonth);
        long mIndex = extraMoney/MILLION;

        System.out.println("The extra money you will get is: " + Math.floor(mIndex) + " million " + (extraMoney-Math.floor(mIndex)*MILLION)/THOUSAND + " thousand");

    }

    public static long calculateInterestMoney(long deposit, int interestRate, int numbersOfMonth){
        return deposit * interestRate * numbersOfMonth / (12*100);
    }
}
