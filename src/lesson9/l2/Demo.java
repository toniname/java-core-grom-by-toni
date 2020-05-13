package lesson9.l2;




public class Demo {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(43564646, "daffy", "sdfdgdg");
        users[1] = new User(43123546, "manna", "fdhhy");
        users[2] = new User(97843224, "cabbage", "sdfsw");
        users[3] = new User(34545633, "xctest", "rghjjj");
        users[4] = new User(67789899, "gecko", "dhvhv");
        for(int i = 0; i <= 4; i++ ) {
            //System.out.println(users[i].getName());
            // System.out.println(users[i].getId());
            // System.out.println(users[i].getSessionId());
        }

        System.out.println();

      UserRepository userRepository = new UserRepository(users);

        //System.out.println(userRepository.getUserByName("daffy"));
        System.out.println(userRepository.getUserNames());
        System.out.println(userRepository.save( users [5]));

       // System.out.println(userRepository.getUserByName());


    }

}






