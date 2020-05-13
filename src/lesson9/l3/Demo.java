package lesson9.l3;
/*доп задачи:
- класс User и UserRepository остаются такими же как в уроке 9
написать класс Demo, внутри него main метод. В нем создайте массив User объектов - любой длины.
Иипользуя этот массив, создайте объект класса UserRepository.

- класс User и UserRepository остаются такими же как в уроке 9
в UserRepository  написать метод - getFirstUser, который вернет первого юзера с масива users

- класс User и UserRepository остаются такими же как в уроке 9
в UserRepository  написать метод - getFirstUserName, который вернет имя первого юзера с масива users*/
public class Demo {

    public static void main(String[] args){
        User [] users = new User[5];
        users[0] = new User (43564646, "dsadsfff", "sdfdgdg");
        users[1] = new User (43123546, "mbnjnn", "fdhhy");
        users[2] = new User (97843224, "cvbbxcvc", "sdfsw");
        users[3] = new User (34545633, "xcvbsdg", "rghjjj");
        users[4] = new User (67789899, "ghkjkjo", "dhvhv");
for(int i = 0; i <= 4; i++ ) {
    System.out.println(users[i].getName());
   // System.out.println(users[i].getId());
   // System.out.println(users[i].getSessionId());
}

        System.out.println();

      UserRepository userRepository = new UserRepository(users);
        System.out.println(userRepository.getFirstUser());
        System.out.println(userRepository.getFirstUserName());
     // System.out.println(userRepository.getFirstUserName(users));

    }

}
