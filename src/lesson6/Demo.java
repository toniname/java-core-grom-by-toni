package lesson6;


import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //проверка Сar
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
        //проверка DemoHomeWork
        DemoHomeWork demoHomeWork = new DemoHomeWork();
        System.out.println(demoHomeWork.createOrderAndCallMethods());
        System.out.println(demoHomeWork.createOrder());
        //проверка Order
        Order order = new Order();
        System.out.println(order.checkPrice());
        System.out.println(order.isValidType());
        //проверка User
        User user = new User("dfdfsf", 45, "Kiev", new Date(), true );
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.city);
        System.out.println(user.LastActiveDate);
        System.out.println(user.isActive);


    }
}
