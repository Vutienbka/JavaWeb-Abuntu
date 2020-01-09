package CircleComparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.0);
        circles[1]= new Circle(5.0);
        circles[2] = new Circle(8.0);

        CircleComparator circleComparator = new CircleComparator();
        for(int i =0; i<circles.length-1; i++){
            System.out.println(circleComparator.compare(circles[i],circles[i+1]));
        }
        //Hoan vi doi tuong

        for(int i=0; i< circles.length-1; i++){
            if(circles[i].getRadius() < circles[i+1].getRadius())
            {
                double temp;
                temp = circles[i].getRadius();
                circles[i].setRadius(circles[i+1].getRadius());
                circles[i+1].setRadius(temp);
            }

            //Hoan vi doi tuong ta lam nhu sau
//            Circle temp;
//            temp = circles[i];
//            circles[i] = circles[i+1];
//            circles[i+1]= temp;
        }

        for(int i =0; i<circles.length-1; i++){
            System.out.println(circleComparator.compare(circles[i],circles[i+1]));
        }
        // In ban kinh sau khi da hoan vi
        for(int i =0; i<circles.length; i++){
            System.out.println(circles[i].getRadius());
        }

        // Sap xep chieu tang dan ban kinh dong thoi hoan vi
        for (int i =0; i<circles.length-1 ; i++)
            for (int j =i+1; j<circles.length; j++)
            {
                if(circleComparator.compare(circles[i],circles[j]) != -1)
                {
                    Circle temp;
                    temp = circles[i];
                    circles[i] = circles[j];
                    circles[j]= temp;
                }

            }
        // In ban kinh sau khi da hoan vi
        for(int i =0; i<circles.length; i++){
            System.out.println(circles[i].getRadius());
        }
    }
}
