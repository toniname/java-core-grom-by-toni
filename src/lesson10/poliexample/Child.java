package lesson10.poliexample;

public class Child extends Human {

    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Child class is called ....");
        super.run();
    }
}
