package lesson10.poliexample;



public class User extends Human { // юзер наследник Human

    public User(String name) { //конструктор для вызова метода в демо
        super(name); //вызов конструктора супер класса public Human(String name) с параметром String name

    }

    @Override
    void run() {
        System.out.println("Child class is called ....");
        super.run();
    }
}
