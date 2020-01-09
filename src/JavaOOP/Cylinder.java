package JavaOOP;

public class Cylinder extends Circle{
    private int height;
    public Cylinder(){} // Neu lop Circle khong co constructor rong thi khong thet tao duoc lop constructor rong trong Cylinder

    public Cylinder(int radius, int height){
        super(radius); // Su dung lai constructor cua Class Circle
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * this.height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(25);
        Cylinder cylinder = new Cylinder(25, 30);

        System.out.printf("Area of cylinder: %-10.2f", cylinder.getArea());
        System.out.printf("Volume of Cylinder: %-10.2f", cylinder.getVolume());
    }

}
