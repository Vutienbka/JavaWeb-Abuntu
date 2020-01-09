package INTRODUCTION_J;
import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ty gia dollar / VND hien tai la 1 / 23000");
        System.out.println("Nhap so dollar: ");
        float dollar_num = scanner.nextFloat();
        System.out.printf("Tri gia tien VND la: %10.2f VND", dollar_num*RATE);
    }
}
