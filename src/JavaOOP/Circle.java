package JavaOOP;

public class Circle {
    private int radius;
    public Circle(){}
    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
