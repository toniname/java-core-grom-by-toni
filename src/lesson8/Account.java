package lesson8;

public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }
    void depositMoney(int amount){
        moneyAmount += amount;
    }
    void changeOwnerName(String newOwnerName ){
        ownerName = newOwnerName;
    }
}