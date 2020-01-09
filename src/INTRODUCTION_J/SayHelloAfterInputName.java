package INTRODUCTION_J;
import java.util.Scanner;

public class SayHelloAfterInputName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Name: ");
        String sayName = scanner.nextLine();
        System.out.println("Hello: "+ sayName);
    }
}
