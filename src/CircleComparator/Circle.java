package CircleComparator;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setColor(String color){
        super.setColor(color);
    }
    public void setFilled(boolean filled){
        super.setFilled(filled);
    }

    public double getPerimeter(){
        return this.radius * Math.PI *2;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public String toString(){
        return "A Circle with radius = " + this.radius + " which is a subclass of " + super.toString();
    }
}