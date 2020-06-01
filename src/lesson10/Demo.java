package lesson10;

import java.util.Date;

/* В классе Demo в main методе создайте по 2 объекта каждого из классов Order. Вызовите у них все три метода в правильной очередности */
public class Demo {
    public static void main(String[] args) {
      //  Customer[] customers = new Customer[4];
       // customers[0] = new Customer("toni", "Харьков", "man");
        // customers[1] = new Customer("Jack", "Днепр", "man");
        // customers[2] = new Customer("Oleg", "Львов", "man");
        // customers[3] = new Customer("Ann", "Киев", "Женский");
        //вывод значений
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("кресло", new Date(),
                "Одесса", "Львов", 3000, new Customer("Тони", "Львов", "Мужской"), 3);
        System.out.println(electronicsOrder);
        System.out.println(electronicsOrder.getBasePrice());
        System.out.println(electronicsOrder.getDateShipped());
        System.out.println(electronicsOrder.getItemName());
        //проверка на налл
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder(null, null,null, null, 0, new Customer("Тони", "Львов", "Мужской"), 3);
        System.out.println(electronicsOrder1);
        System.out.println(electronicsOrder1.getBasePrice());
        System.out.println(electronicsOrder1.getItemName());


        FurnitureOrder furnitureOrder = new FurnitureOrder("стол", new Date(), "Киев", "Харьков",
                30000, new Customer("Тони", "Харьков", "Мужской"), "f00122");
        System.out.println(furnitureOrder);
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("стол", new Date(), "Киев", "Харьков",
                30000, new Customer("Тони", "Харьков", "Мужской"), null);
        System.out.println(furnitureOrder1);

        Customer customer = new Customer("Тони", "Харьков", "Мужской");
        System.out.println(customer);

        Order order = new Order("кресло", new Date(),"Одесса","Львов", 5000, new Customer("Тони", "Львов", "Мужской")) {
            @Override
            public void validateOrder() {

            }

            @Override
            public void calculatePrice() {

            }
        };
        System.out.println(order);

    }

}
