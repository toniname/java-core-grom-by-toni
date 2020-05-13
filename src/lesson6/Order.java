package lesson6;

import java.util.Date;

/*Создайте этот класс и добавьте в него следующее Поля
        long id
        int price
        Date dateCreated
        boolean isConfirmed
        Date dateConfirmed
        String city
        String country
        String type

        Создайте два конструктора:
        1) который будет использовать все поля, кроме id
        2) пустой

        Создайте методы:
        confirmOrder() - должен проставлять ордер в статус confirmed = true и дату конфирма ставить в текущую
        checkPrice() - должен возвращать true если цена сделки больше 1000 и false в другом случае
        isValidType() - type поле может принимать только два значения - Buy, Sale - метод возвращает true если это требование выполняется и false если нет*/
public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;


    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {

    }

    public void confirmOrder() {
        isConfirmed = true;
        dateConfirmed = new Date();

    }

    public boolean checkPrice() {
        boolean result;
        if (price > 1000) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean isValidType() {
        String Buy = null;
        String Sale = null;
        if (type == Buy || type == Sale) {
            return true;
        }
        return false;
    }
}
