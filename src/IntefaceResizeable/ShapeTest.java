package IntefaceResizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(20);
        shape[1] = new Circle(30);
        double percent = Math.random() * 100 + 1;
        for(int i = 0; i< shape.length; i++) {
            if(shape[i] instanceof Square) {
                ((Square) shape[i]).resize(percent);
            }
            if(shape[i] instanceof Circle)
                ((Circle)shape[i]).resize(percent);
        }

        for (Shape s: shape
             ) {
            System.out.println(s);
        }

    }
}