package ArrayInJava;
import java.util.Scanner;

public class SumInSelectedColumnInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [][] array ={
                {1,2,3,4,5},
                {5,6,7,8,9},
                {7,5,7,5,9}
        };
        System.out.println("Input column you want to sum: ");
        int numOfColumn = scanner.nextInt();

        int sum = 0;

        for(int i = 0; i< array.length; i++)
            for(int j = 0; j< array[i].length; j++) {
                if(j== numOfColumn)
                    sum += array[i][j];
            }
        System.out.println("Sum of elements of column " + numOfColumn + " is: " + sum);
    }
}
