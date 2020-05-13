package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new USBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 44445322);
        User user = new User(1013, "Denic", 123344, 40,  "gmd", 1500, euBank);

        BankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user, 150);
        bankSystem.transferMoney(user, user, 100 );
        System.out.println(user.getBalance());

    }
}
