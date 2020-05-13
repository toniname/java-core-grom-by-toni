package lesson8;

public class IPhone extends Phone{

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println(" IPhone constructor was invoked....");
       // this.price = price;
       // this.weight = weight;
        //this.countryProduced = countryProduced;
        this.fingerPrint = fingerPrint;
    }

    void deleteIPhoneFromDb(){
        System.out.println("deleteIPhoneFromDb invoked....");
    }
}
