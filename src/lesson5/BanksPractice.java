package lesson5;

import java.util.Arrays;

public class BanksPractice {

    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));
        depositMoney(names, balances, "Ann", 1000);
        System.out.println(Arrays.toString(balances));
    }

    static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        int count = 0;
        for (int balance : balances) { //проход по массиву баланс- элемент :балансес - имя масива
            if (balance >= n) // условие по соответствию н
                count++; //счетчик инкримент
        }
        String[] results = new String[count]; //создание массива с длиной каунт
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }

    static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;
        }
        String[] results = new String[count];
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }

    static void depositMoney(String[] clients, int[] balances, String client, int money) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        int moneyToDeposit = money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
        balances[clientIndex] += moneyToDeposit;
    }
}
