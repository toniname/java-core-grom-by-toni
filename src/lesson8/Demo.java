package lesson8;

public class Demo  {
    public static void main(String[] args) {
        //проверка SavingAccount
        SavingAccount savingAccount = new SavingAccount("SomeBank", "Denis", 1000, 50 );
        savingAccount.depositMoney(100);
        System.out.println(savingAccount.moneyAmount);
        savingAccount.changeOwnerName("Oleg");
        System.out.println(savingAccount.ownerName);//достает поле ownerName из класса SavingAccount через метод savingAccount

        //проверка CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("SomeBank", "Denis", 1000, 500 );
        checkingAccount.changeOwnerName("Oleg");
        System.out.println(checkingAccount.ownerName);

        //проверка Account
        Account account = new Account("bank", "qweqwe", 3579);
        System.out.println(account);
        account.depositMoney(2322411);
    }
}
