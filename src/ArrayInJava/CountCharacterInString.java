package ArrayInJava;
import java.util.Scanner;


public class CountCharacterInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi:");
        String string = scanner.nextLine();
        System.out.println("Nhap ky tu can tim:");
        // string.charAt(i): lay ky tu tai vij tri thu i trong chuoi

        char character = scanner.nextLine().charAt(0);

        char[] charArray = string.toCharArray(); //doi chuoi thanh mang ky tu

        int count = 0;
        for(int i=0; i< charArray.length; i++)
            if(charArray[i] == character)
                count ++;

        System.out.println("So ky tu " + character + " trong chuoi da nhap la: " + count);
    }

}
