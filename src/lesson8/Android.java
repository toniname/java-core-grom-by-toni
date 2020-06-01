package lesson8;

public class Android extends Phone {

    String androidVersion;
    int screenSize;
    String secretDeviseCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
        //this.price = price;
       // this.weight = weight;
       // this.countryProduced = countryProduced;
        super(price, weight, countryProduced);//- super наследует родительский класс в данном случае Phone
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }

    void installNewAndroidVersion(){
        System.out.println("installNewAndroidVersion invoked....");
    }

    @Override
    public String toString() {
        return "Android{" +
                "androidVersion='" + androidVersion + '\'' +
                ", screenSize=" + screenSize +
                ", secretDeviseCode='" + secretDeviseCode + '\'' +
                '}';
    }
}
