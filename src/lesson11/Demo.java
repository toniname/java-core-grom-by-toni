package lesson11;
/*В классе Demo в main методе протестируйте свое решение на тестовых данных, чтобы убедиться в его правильности.
При этом, Demo класс не нужно сабмитить на сайт*/


import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Room[] rooms = new Room[4];
        rooms[0] = new Room( 343455353, 300, 3, new Date(), "Kharkov", "Kharkov");
        rooms[1] = new Room( 5564, 400, 3, new Date(), "Kiev", "Kharkov");
        rooms[2] = new Room( 776355, 544, 3, new Date(), "Metropol", "Kharkov");
        rooms[3] = new Room( 689999, 350, 3, new Date(), "Hotel", "Kharkov");
        System.out.println();
    }
}
