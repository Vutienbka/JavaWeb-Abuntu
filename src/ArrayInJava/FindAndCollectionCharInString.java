package ArrayInJava;
import java.util.Scanner;

public class FindAndCollectionCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = scanner.nextLine();

        char[] charArray = string.toCharArray(); //doi chuoi thanh mang ky tu
        char [] newCharArray = new char[string.length()];
        int count = 0;

        for(int i=0; i< charArray.length; i++)
            if(charArray[i] <48 || charArray[i]>57)
            {
                newCharArray[count] = charArray[i];
                count++;
            }
        for(int i=count; i<newCharArray.length; i++)
            newCharArray[i]= 32; // 3SCII cua khoang trang

        System.out.println("Chuoi ky tu la: ");
        for(int i=0; i< newCharArray.length; i++)
        System.out.print(newCharArray[i]);
    }
}
