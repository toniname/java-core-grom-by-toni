package lesson8.ADS;

import java.util.Date;

public class CarAd extends Ad {
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd(long id, Date dateCreate, int price, int yearOfManufacturing) {
        super(id, dateCreate, price);

    }

    void confirmAd(){

    }
}
