package lesson10;

import java.util.Date;
/*Необходимо реализовать иерархию заказов в условном интернет-магазине. Корневым классом в иерархии будет Order с полями:
String itemName;   Date dateCreated;  Date dateConfirmed;  Date dateShipped;   String shipFromCity;  String shipToCity;  int basePrice;  double totalPrice;
Customer customerOwned;

Конструктор которого содержит все поля класса кроме:
dateConfirmed;    dateShipped;   totalPrice;

У класса есть методы без реализации:
void validateOrder();    void calculatePrice()

А так же обычный метод
void confirmShipping()
который проставляет дату доставки в текущую, если она еще не проставлена

Все поля открыты для чтения, и три поля открыты для модификации:
dateShipped;   dateConfirmed;    totalPrice;   */

public abstract class  Order {
    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed;
    private Date dateShipped;
    private String shipFromCity;
    private String shipToCity;
    private int basePrice;
    private double totalPrice;
    private Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    public abstract void validateOrder();
    public abstract void calculatePrice();
    public void confirmShipping() {
        if (dateShipped == null )  dateShipped = new Date();

    }
    public int getBasePrice(){
        return basePrice;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
       this.totalPrice = totalPrice;

    }
    public String getItemName(){
        return itemName;
    }
    public Customer getCustomerOwned(){
            return customerOwned;
    }
    public Date getDateConfirmed() {
        return dateConfirmed;
    }
    public void setDateConfirmed(Date dateConfirmed){
        this.dateConfirmed = dateConfirmed;
    }
    public Date getDateShipped(){
        return dateShipped;
    }
    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String getShipFromCity(){
        return shipFromCity;
    }
    public String getShipToCity(){
        return shipToCity;
    }
}
