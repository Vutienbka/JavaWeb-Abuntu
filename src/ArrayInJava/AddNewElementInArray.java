package ArrayInJava;
import java.util.Scanner;

public class AddNewElementInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for(int i=0; i<array.length-3; i++)
            array[i]=i;
        System.out.println("List of first array is: ");
        for(int i=0; i<array.length ;i++)
            System.out.print(array[i] + " ");

        System.out.println("Input the value of element you want to insert: ");
        int newValue = scanner.nextInt();
        int newIndex = -1;
        while(0> newIndex || newIndex > array.length-1) {
            System.out.println("Input the index of element you want to insert: ");
            newIndex = scanner.nextInt();
        }
        for(int i= 0; i<= array.length-1; i++){
            int temp;
            if(i >= newIndex)
            {
                temp = array[i];
                array[i]= newValue;
                newValue = temp;
            }
        }
        System.out.println("List of array after insert is: ");
            for(int i=0; i<array.length ;i++)
                System.out.print(array[i] + " ");
    }
}
