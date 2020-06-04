package mateAkademi;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }


    public boolean fight(Robot robot1, Robot robot2){
        return robot1.power > robot2.power;

    }


}
