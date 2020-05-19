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
        //2 балансы совпадают

        // для finde5unique
        //просто вывод данных
        finde5unique finde5unique = new finde5unique();
        int[] array3 = {11, 12, 10, 5, 4, 44, 100, 44, 10, 11, 3};
        System.out.println(lesson5.finde5unique.uniqueCount(array3));
        //2 когда все элементы равны
        int[] array4 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(lesson5.finde5unique.uniqueCount(array4));

        // для owerDraft
        owerDraft owerDraft = new owerDraft();
        //просто вывод данных
        String[] clients = {"Jack", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances1 = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(owerDraft.withdraw(clients, balances1, "Denis", 8432));
        //2 когда amount = balances
        String[] clients1 = {"Jack", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances2 = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(owerDraft.withdraw(clients1, balances2, "Denis", 8432));
        //3 когда клиент с отрицательным балансом
        String[] clients2 = {"Jack", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances3 = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(owerDraft.withdraw(clients2, balances3, "Andrey", 50));
    }
}
