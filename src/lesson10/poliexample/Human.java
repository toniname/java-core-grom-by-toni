package lesson10.poliexample;

public class Human {
    private String name;

    public Human(String name) { //конструктор для вызова метода в демо
        this.name = name;
    }

    void run (){
        System.out.println("Human class is called....");
        System.out.println( name + " is running");
    }
}
