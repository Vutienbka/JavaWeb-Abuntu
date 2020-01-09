package INTRODUCTION_J;
import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input height (m): ");
        double height = scanner.nextDouble();
        System.out.println("Input weight (kg): ");
        double weight = scanner.nextDouble();

        double BMI = weight/Math.pow(height,2);
        System.out.printf("BMI index: %6.3f \n" , BMI);

        if(BMI < 18.5)
            System.out.println("Under weight");
        else if(BMI < 25)
            System.out.println("Normal");
        else if(BMI <30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
