package lesson10;
import java.util.Date;
/*  Класс ElectronicsOrder описывает заказы электроники. У него есть дополнительное поле:
int guaranteeMonths
Класс реализовывает абстрактные методы по правилам:
-валидация
заказ возможен с городов: Киев, Одесса, Днепр, Харьков и в один из этих городов. Минимальная цена заказа 100.
Так же имя клиента который делает заказ может быть любым, а пол только женским
-расчет цены
Цена может состоит из цены товара и цены за доставку. Так же могут быть скидки. Если доставка производится в любой город,
кроме Киева и Одессы, то цена за доставку - 15% от суммы заказа. В других случаях 10%. Так же если цена
больше 1000 то скидка на заказ 5% после оплаты комиссии за доставку */
public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String gender = getCustomerOwned().getGender();
        if (getShipFromCity() != null && getShipFromCity().equalsIgnoreCase("Киев") || getShipFromCity().equalsIgnoreCase("Одесса")
                || getShipFromCity().equalsIgnoreCase("Днепр") || getShipFromCity().equalsIgnoreCase("Харьков") &&
                getShipToCity() != null && getShipToCity().equalsIgnoreCase("Киев") || getShipToCity().equalsIgnoreCase("Одесса")
                || getShipToCity().equalsIgnoreCase("Днепр") || getShipToCity().equalsIgnoreCase("Харьков") && getBasePrice() >= 100 && gender.equalsIgnoreCase("Женский")) {
            setDateConfirmed(new Date());
        }

    }

    @Override
    public void calculatePrice() {
        double priceDelivery = getBasePrice();
        if (priceDelivery != 0 && !getShipToCity().equals("Киев") || !getShipToCity().equals("Одесса")) {
            priceDelivery += priceDelivery * 0.15;
        }else {
            priceDelivery += priceDelivery * 0.1;
        }
        double bonus = getBasePrice() > 1000 ? getBasePrice() * 0.05 : 0 ;
        setTotalPrice(priceDelivery - bonus);

    }
}
