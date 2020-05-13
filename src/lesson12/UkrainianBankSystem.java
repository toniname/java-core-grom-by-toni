package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        // проверить можно ли снять деньги, проверить лимит, проверить достаточно ли денег
        //снять деньги
      /*  int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();

        if (amount + user.getBank().getCommission(amount) > limitOfWithdrawal) { // проверить можно ли снять деньги,
            printWithdrawalErrorMsg(amount, user);
            return;
        }
        if (amount + user.getBank().getCommission(amount) > user.getBalance()) { // проверить лимит,
            printWithdrawalErrorMsg(amount, user);
            return;
        }
    }*/
        if (!checkWithdraw(user, amount)) //то же что и сверху
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }


    @Override
    public void fund(User user, int amount) {
        //пополнение
        //для пополнения - проверка только на лимиты и если можно - пополнение баланса
        if (amount <= user.getBank().getLimitOfFunding()) {  // проверить лимит,
            printFundErrorMsg(amount, user);
            user.setBalance(user.getBalance() + amount);
        }
    }


    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //снимаем деньги с from user
        //для снатия - проверка на лимиты и достаточно ли денег, если да - снятие
        if (!checkWithdraw(fromUser, amount) || amount > toUser.getBank().getLimitOfFunding() ||
                fromUser.getBank().getCurrency() != toUser.getBank().getCurrency()) {
            printTransferErrorMsg(amount, fromUser, toUser);
            return;
        }
        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);


    }

    @Override
    public void paySalary(User user) {
        if (user.getSalary() <= user.getBank().getLimitOfFunding()) {  // проверить лимит,
            user.setBalance(user.getBalance() + user.getSalary());
        }
    }

    /* private boolean checkWithdraw(User user, int amount, double limit) {   //проверить достаточно ли денег при снятии
           if (amount + user.getBank().getCommission(amount) > limit) {
               printWithdrawalErrorMsg(amount, user);
               return false;
           }
           return true;
       }*/
    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) && checkWithdrawLimits(user, amount, user.getBalance());//то же что и сверху
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {   //проверить достаточно ли денег
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;

    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money" + amount + "from user" + user);
    }

    private void printFundErrorMsg(int amount, User user) {
        System.err.println("Can't fund money" + amount + "from user" + user);
    }

    private void printTransferErrorMsg(int amount, User fromUser, User toUser) {
        System.err.println("Can't transfer money" + amount + "from user" + fromUser + "to user" + toUser);
    }
}

