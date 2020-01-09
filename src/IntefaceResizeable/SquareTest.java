package IntefaceResizeable;

public class SquareTest {
    public static void main(String[] args) {

        Square square = new Square(5.8, "yellow", true);
        System.out.println(square);

        square.resize(60);
        System.out.println(square);
    }
}