package IntefaceResizeable;

public class CircleTest{
    public static void main(String[] args) {

        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(30);
        System.out.println(circle);
    }
}
