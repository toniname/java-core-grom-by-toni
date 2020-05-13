package lesson5;

public class owerDraft {
    public static void main(String[] args){
        String[] clients = {"Jack", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(withdraw(clients, balances, "Denis", 9000));
    }
    private static int withdraw(String[] clients, int[] balances, String client, int amount) {
        int clientIndex = 0;
        for (String cl : clients){
            if (cl == client) {
                break;
            }
            clientIndex++; //
        }
        int moneyToDeposit = balances[clientIndex] < amount ? (int) (-1) : balances[clientIndex] - amount ; // balances[clientIndex] подключение массива balances к счетчику переборки массива clients
        return moneyToDeposit;
    }

}
