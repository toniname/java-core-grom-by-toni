package lesson8.ADS;

import java.util.Date;

public class Ad extends BaseEntity {
    int price;
    Date dateCreated;

    public Ad(long id, Date dateCreate, int price) {
        super(id);
        this.price = price;
        this.dateCreated = new Date();
    }

    public Ad(long id, int price) {
        super(id);
    }


    void publishAd() {

    }


}
