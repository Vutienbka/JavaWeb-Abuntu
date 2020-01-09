package JavaOOP;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4 * this.a * this. c;
    }

    public double getRoot1(){
        return ( -this.getB()- Math.sqrt(this.getDiscriminant()) )/(2 * this.getA());
    }
    public double getRoot2(){
        return ( -this.getB()+ Math.sqrt(this.getDiscriminant()) )/(2 * this.getA());
    }
    public double getOneRoot(){
        return -this.getB()/(2*this.getA());
    }

    // Ham main
    public static void main(String[] args) {
        QuadraticEquation newEquation;
        newEquation = new QuadraticEquation(1,2.0,3.0);
        System.out.printf("Phuong trinh can giai la: %3.0fX^2 + %3.0fX + %3.0f = 0 \n", newEquation.getA(), newEquation.getB(), newEquation.getC());

        if(newEquation.getA() == 0){
            System.out.println("Phuong trinh da cho la phuong trinh bac nhat");
            if(newEquation.getB() == 0){
                if(newEquation.getC() == 0)
                    System.out.println("Phuong trinh vo so nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");
            }
            else
                System.out.printf("Phuong trinh co nghiem duy nhat: %5.2f", -newEquation.getC()/newEquation.getB());
        }
        else {
            System.out.println("Phuong trinh da cho la phuong trinh bac hai");
            if(newEquation.getDiscriminant() < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if(newEquation.getDiscriminant() == 0)
                System.out.printf("Phuong trinh co nghiem kep: %-5.2f" , newEquation.getOneRoot());
            else {
                System.out.println("Phuong trinh co hai nghiem phan biet la: ");
                System.out.printf("Nghiem 1: %-5.2f \nNghiem 2: %-5.2f", newEquation.getRoot1(), newEquation.getRoot2());
            }
        }
    }
}
