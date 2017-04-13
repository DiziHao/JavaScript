package java1702.javase;

/**
 * Created by 邸子豪 on 2017/4/6.
 */
//private String name;

public class Car extends Vehicle {


    public Car(String name,double speer,String color) {
        super(name,speer,color);
    }
    public void run() {
        System.out.println("car:"+getName()+"is running...");
    }

    public void stop() {
        System.out.println("car:"+getName()+"stopped");
    }
    public static void main(String[] args) {
        Car car = new Car("Tom's car",20d,"black");
        car.run();
        car.stop();

    }
}
