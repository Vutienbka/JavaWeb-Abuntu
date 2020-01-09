package INTRODUCTION_J;
import java.util.Scanner;

public class DaysInMonthCounting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String DaysInMonth;

        switch(month){
            case 2: DaysInMonth = "28 or 29 Days";
            break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: DaysInMonth = "31 Days";
            break;

            case 4:
            case 6:
            case 11: DaysInMonth = "30 Days";
            break;

            default: DaysInMonth="";
                break;
        }
        if(DaysInMonth !="")
            System.out.println("The month " + month + " has " + DaysInMonth);
        else
            System.out.println("Invalid value");
    }
}
