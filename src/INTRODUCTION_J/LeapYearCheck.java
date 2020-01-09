package INTRODUCTION_J;
import java.util.Scanner;

// Nhung nam chia het cho 4 ma khong chia het cho 100 la nam nhuan
// Nhung nam chia het cho 100 ma khong chia het cho 400 khong phai la nam nhuan
// Nhung nam chi het dong thoi cho 100 va 400 la nam nhuan
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Year");
        int year = scanner.nextInt();

        if(year % 4 == 0)
            if(year % 100 == 0)
                if(year % 400 == 0)
                    System.out.println("Leap year");
                else
                    System.out.println("NOT leap year");
            else
                System.out.println("Leap Year");
        else
            System.out.println("NOT leap year");
    }
}
