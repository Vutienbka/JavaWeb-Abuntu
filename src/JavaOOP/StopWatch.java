package JavaOOP;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
    }

    public void start(long startTime){
        this.startTime = startTime;
    }

    public void stop(long stopTime){
        this.endTime = stopTime;
    }

    public long getElapseTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {

       StopWatch time = new StopWatch();

       time.start(System.currentTimeMillis());
        System.out.println("Thoi gian hien tai la: " + time.startTime);
        selectionSort();
        time.stop(System.currentTimeMillis());
        System.out.println("Thoi gian sau khi ket thuc thuat toan la: " + time.endTime);
        System.out.println("Thoi gian thu hien thuat toan la: " + time.getElapseTime());


    }

    public static void selectionSort(){
        for(int i= 0; i<100000; )
        {i++;}
    }

}
