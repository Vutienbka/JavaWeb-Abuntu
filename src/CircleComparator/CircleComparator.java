package CircleComparator;

public class CircleComparator extends Circle implements Comparator {
    @Override
    public int compare(Circle circle1, Circle circle2){
        if(circle1.getRadius() > circle2.getRadius())
            return 1;
        else if(circle1.getRadius() < circle2.getRadius())
            return -1;
        else return  0;
    }
}