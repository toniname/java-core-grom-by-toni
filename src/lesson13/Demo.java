package lesson13;


import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        //1 сохранение юзера
        //2 сохранение того же юзера
        //3 когда нет места в массиве
        //4  сохраняем нал
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        User user = new User(232324, "Ann", "dfg1ff3g455");//1 сохранение юзера
         userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(user);//2 сохранение того же юзера
        System.out.println(Arrays.deepToString(userRepository.getUsers()));//2 сохранение того же юзера

        int i = 15;
        while (i > 0) {
            User user1 = new User(i, "Ann", "dfg1ff3g455");//3 когда нет места в массиве
            System.out.println(userRepository.save(user1));//распечатка каждого шага при переборе массива
            i--;
        }
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(null); //4  сохраняем нал

        //test update
        //1 обновление юзера
        //2 когда нет юзера на обновление
        //3  обновляем нал
        user = new User(232324, "Ann", "dfg1ff");//1 обновление юзера
        userRepository.update(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        user = new User(232323, "Ann", "dfg1ff");//2 когда нет юзера на обновление
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));


        System.out.println(userRepository.update(null));//3  обновляем нал
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
    }


}