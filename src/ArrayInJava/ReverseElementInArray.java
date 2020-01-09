package ArrayInJava;
import java.util.Scanner;

public class ReverseElementInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] array ={
                {1,2,3,4,5},
                {5,6,7,8,9},
                {7,5,7,5,9},
                {1,5,5,8,7},
                {2,5,7,9,1}
        };
        for(int i= 0; i< array.length; i++){
            if(i%2 !=0){
                for(int j=0, k= array[i].length-1; j< k; j++, k--){
                    int temp;
                    temp = array[i][j];
                    array[i][j] = array[i][k];
                    array[i][k] = temp;
                }
            }
        }

        System.out.println("Array after change is: ");
        System.out.println("{");
        for(int i= 0;i< array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if(j<array.length-1)
                System.out.print(array[i][j] + ", ");
                else
                    System.out.print(array[i][j] + "");
            }
            if(i< array.length-1)
            System.out.println("},");
            else
                System.out.println("}");
        }
        System.out.println("}");

    }
}
