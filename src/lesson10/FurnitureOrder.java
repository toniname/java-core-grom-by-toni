package lesson10;

import java.util.Date;

/* Класс FurnitureOrder описывает заказы мебели. У него есть дополнительное поле:
String furnitureCode
Класс реализовывает абстрактные методы по правилам:
валидация
Заказ возможен с городов: Киев, Львов и в любой город. Минимальная цена заказа 500. Так же имя клиента который делает заказ не может быть "Тест",
а пол может быть любым
расчет цены
Коммисия за доставку - 5% от суммы заказа если сумма меньше 5000 и 2% в других случаях  */
public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        String name = getCustomerOwned().getName();
        if ((getShipFromCity().equalsIgnoreCase("Киев") || getShipFromCity().equalsIgnoreCase("Львов"))
                && !name.equalsIgnoreCase("Test") && getBasePrice() >= 500)//Метод equalsIgnoreCase()сравнивает данную строку с другой строкой, игнорируя регистр.
            setDateConfirmed(new Date());

    }

    @Override
    public void calculatePrice() {
        double basePrice = getBasePrice();
        if (basePrice < 5000) {
            basePrice += basePrice * 0.05;
        } else {
            basePrice += basePrice * 0.02;
        }
        setTotalPrice(basePrice);
    }
}
