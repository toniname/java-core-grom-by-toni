package lesson10.poliexample;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);

        System.out.println();

        User user = new User("Jack"); // вызов ран через юзер
        run(user);

    }

  //  private static void run (User user){ аналогично коду ниже (напрямую обращается к юзеру, но работает только для юзера)
   //     user.run();
   // }
    private static void run(Human human) { //принимает Human обьект  (приватным потому что нигде не используется, статик потому что используется в main)
        human.run(); // вызывает у Human объекта метод ран
    }
}
