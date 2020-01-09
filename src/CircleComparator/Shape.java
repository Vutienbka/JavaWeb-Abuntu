package CircleComparator;

public class Shape {
    private String color = "green";
    private boolean isFilled = true;

    public Shape(){

    }
    public Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.isFilled =filled;
    }

    public String getColor(){
        return this.color;
    }

    public boolean getFilled() {
        return this.isFilled;
    }

    public String toString(){
        return "A Shape with color of " + this.getColor()+" and" + (this.getFilled()?" Filled" :" NOT filled");
    }
}
