package lesson7;
/*В классе DemoHomeWork создайте два метода
        createOrder()
        createOrderAndCallMethods()
        Первый метод должен возвращать объект класса Order с предыдущего ДЗ созданного с параметрами
        price = 100, dateCreated = текущая, isConfirmed = false, dateConfirmed = null, city = "Dnepr", country = "Ukraine", type = "Buy"
        Второй метод доллжен создавать объект с другими параметрами
        price = 100, dateCreated = текущая, isConfirmed = true, dateConfirmed = текущая, city = "Kiev", country = "Ukraine", type = "SomeValue"
        Вызывате все методы с класса Order через его объект и возвращать объект*/

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    Order createOrder() {//Order - тип возвращаемых данных
        Date dateCreated = new Date();
        Order order = new Order(100, dateCreated, false, null, "Dnepr", "Ukraine", "Buy");//создание объекта класса и переприсвоение новыех значений полям класса
        return order;


    }


    Order createOrderAndCallMethods() {//Order - тип возвращаемых данных
        Date dateCreated = new Date();
        Date dateConfirmed = new Date();
        Order orderObject = new Order(100, dateCreated, true, dateConfirmed, "Kiev", "Ukraine", "SomeValue");
        orderObject.isValidType();
        orderObject.confirmOrder();
        orderObject.checkPrice();
        return orderObject;


    }

}
