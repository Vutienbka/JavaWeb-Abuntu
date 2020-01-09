package INTRODUCTION_J;
import java.util.Scanner;


public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();

        if(a==0)
            if(b==0)
                System.out.println("Countless experimental equation");
            else
                System.out.println("Imposible Equation");
        else
            System.out.printf("Unique Equation :  %6.2f", -b/a);
    }
}
