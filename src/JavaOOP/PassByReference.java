package JavaOOP;
import java.util.Scanner;

public class PassByReference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number a = new Number();
        Number b = new Number();
        Swap sw = new Swap();

        System.out.print("Nhap a: ");
        a.setNumber(scanner.nextInt());
        System.out.print("Nhap b: ");
        b.setNumber(scanner.nextInt());
        scanner.close();
        sw.swap(a,b);
        System.out.println("a and b after swap is: ");
        System.out.println("a = " + a.getNumber() + " b= " + b.getNumber());
    }
}

class Number{
    int number;
    void setNumber(int number){
        this.number = number;
    }
     int getNumber(){
         return this.number;
     }
}

class Swap{
    public void swap(Number a, Number b){
        int temp;
        temp = a.getNumber();                  // gan num cua a cho temp
        a.setNumber(b.getNumber());                   // gan num cua b cho a
        b.setNumber(temp);
    }
}