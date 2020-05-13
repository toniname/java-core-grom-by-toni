package lesson6;

import java.util.Date;

public class User {
    String name;
    int age;
    String city;
    Date LastActiveDate;
    boolean isActive;

    public User(){

    }

    public User(String name, int age, String city, Date LastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.LastActiveDate = LastActiveDate;
        this.isActive = isActive;
    }

    public User(String name) {

        this.name = name;
    }

    void logIn() {
        LastActiveDate = new Date(); //меняет LastActiveDate на текущую дату
    }

    void isActive(boolean status) {//
        isActive = status;
    }

    void increaseAge() {
        age++;
    }

}
