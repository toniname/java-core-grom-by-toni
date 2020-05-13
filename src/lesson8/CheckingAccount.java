package lesson8;

public class CheckingAccount extends Account{
    int limitOFExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExpenses) {
        super(bankName, ownerName, moneyAmount); //super-наследует родительский класс в данном случае Account
        this.limitOFExpenses = limitOFExpenses;
    }

    void withdraw(int amount){
        if(amount > limitOFExpenses)
            return;
        moneyAmount -= amount;
    }
   /* void changeOwnerName(String newOwnerName ){
        if(newOwnerName == "Jack" || newOwnerName == "Ann")
        ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't change owner name of this saving account ");
    }*/
}


