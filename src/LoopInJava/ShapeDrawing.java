package LoopInJava;
import java.util.Scanner;

public class ShapeDrawing {
    public static void main(String[] args) {
        System.out.println("Nhap so hang n = ");
        Scanner scanner = new Scanner(System.in);
        int soHang = scanner.nextInt();
        int soCot = (soHang*2)-1;
        int k = (soCot + 1) / 2;

        for(int i =1; i<= soHang; i++ ) {
            for (int j = 1; j <= soCot; j++) {
                if (j <= k - i || j > (k + i - 1))
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}