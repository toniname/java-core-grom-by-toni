package lesson10;

import java.util.Date;

/* Класс Customer описывает клиента, который производит заказ. Его поля:
String name
String city
String gender (допустимые значения - Мужской, Женский; валидировать это не надо, гарантируется что значения тут правильные)
Для создания клиента нужно указать все его поля. Следуйте инкапсуляции, поля класса должны быть доступны только на чтение */
public class Customer {
    private String name;
    private String city;
    private String gender;

    public Customer(String name, String city, String gender) {
        this.name = name;
        this.city = city;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }


}
