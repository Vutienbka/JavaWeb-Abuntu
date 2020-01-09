package JavaOOP;

public class Fan {
    private int speed = 1;
    private float radius = 10.0f;
    private String color = "blue";
    boolean statusOfFan = false;

    public Fan(){

    }
     public void setSpeed(int speed){
        this.speed = speed;
     }
     public String getSpeed(){
        if(this.statusOfFan== true) {
            if (this.speed == 1)
                return "SLOW";
            else if (this.speed == 2)
                return "MEDIUM";
            else return "FAST";
        }
        else return "NONE";
     }

     public void setRadius(float radius){
        this.radius = radius;
     }
     public float getRadius(){
        return this.radius;
     }
     public void setColor(String color){
        this.color = color;
     }
     public String getColor(){
        return this.color;
     }
     public void setStatusOfFan(boolean status){
        this.statusOfFan = status;
     }
     public String getStatusOfFan(){
        if(this.statusOfFan)
            return "ON";
        else return "OFF";
     }

     public String toString(){
        if(this.statusOfFan){
            if(this.speed ==1)
       return "Fan is: " + this.getStatusOfFan() + " Quat dang bat so: "+ this.speed + " Speed: " + this.getSpeed() + " color: " + this.getColor() + " radius: " + this.getRadius();
            else if (this.speed ==2)
                return "Fan is: " + this.getStatusOfFan() + " Quat dang bat so: "+ this.speed +  " Speed: " + this.getSpeed() +" color: " + this.getColor() + " radius: " + this.getRadius();
            else
                return "Fan is: " + this.getStatusOfFan() + " Quat dang bat so: "+ this.speed + " Speed: " + this.getSpeed() + " color: " + this.getColor() + " radius: " + this.getRadius();
        }
        else
            return "Fan is: " + this.getStatusOfFan() + " Quat dang bat so: "+ this.speed + " Speed: "+ this.getSpeed() +" color: " + this.getColor() + " radius: " + this.getRadius();
     }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10.0f);
        fan1.setStatusOfFan(true);
        System.out.println("Dac diem cua quat thu nhat la: ");
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(1);
        fan2.setColor("blue");
        fan2.setRadius(5.0f);
        fan2.setStatusOfFan(false);
        System.out.println("Dac diem cua quat thu hai la: ");
        System.out.println(fan2);
    }
}
