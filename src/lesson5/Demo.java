package lesson5;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //для ArraysPractice
        ArraysPractice arraysPractice = new ArraysPractice();
        int[] array = {-10, 0, 110, 555, 1000, -45, 0, 60};
        //1 просто вывод элементов
        System.out.println(ArraysPractice.maxElement(array));
        //2 когда все элементы равны
        int[] array1 = {10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(ArraysPractice.maxElement(array1));
        //3 когда все элементы 0
        int[] array2 = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(ArraysPractice.maxElement(array2));

        // для BanksPractice
        BanksPractice banksPractice = new BanksPractice();
        //просто вывод данных
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString( BanksPractice.findClientsByBalance(names, balances, 100)));
        System.out.println(Arrays.toString(BanksPractice.findClientsWithNegativeBalance(names, balances)));
        

        System.out.println();
    }
}
