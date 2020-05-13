package lesson10;

import java.util.Date;

/* В классе Demo в main методе создайте по 2 объекта каждого из классов Order. Вызовите у них все три метода в правильной очередности */
public class Demo {
    public static void main(String[] args) {
        /*Customer[] customers = new Customer[4];
        customers[0] = new Customer("toni", "Харьков", "man");
        customers[1] = new Customer("Jack", "Днепр", "man");
        customers[2] = new Customer("Oleg", "Львов", "man");
        customers[3] = new Customer("Ann", "Киев", "Женский");*/

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("кресло", new Date(),
                "Одесса", "Львов", 5000, new Customer("Тони", "Львов", "Мужской"), 3);

        FurnitureOrder furnitureOrder = new FurnitureOrder("стол", new Date(), "Киев", "Харьков",
                30000, new Customer("Тони", "Харьков", "Мужской"), "f00122");
            Customer customer = new Customer("Тони", "Харьков", "Мужской");

        System.out.println(customer);
    }

}
