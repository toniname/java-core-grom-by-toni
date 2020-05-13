package lesson6;
import lesson6.Car;
public class Demo {
    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015, "Anton");
        Car car = new Car(3, 4, "dsfds");
        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);
        System.out.println(carObject.ownerName);
        carObject.horsePower = 100;

        System.out.println(carObject.horsePower);

        carObject.startRun();
        carObject.stopRun();
        carObject.changeOwner("Tast");

        System.out.println(carObject.ownerName);
    }
}
