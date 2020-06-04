package mateAkademi;

public class RobotDemo {
    public static void main(String[] args) {


        Robot robot1 = new Robot("robot1", 3, 50);

        Robot robot2 = new Robot("robot2", 4, 40);

        System.out.println(robot1.fight(robot1, robot2));
    }

}
