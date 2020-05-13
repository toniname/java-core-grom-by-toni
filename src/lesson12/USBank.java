package lesson12;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    /*limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR*/
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 1000;
        return 1200;
    }

    @Override
    /*limit of funding - 10000 if EUR and no limit if USD*/
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR)
            return 10000;
        return Integer.MAX_VALUE; //возврат валюты максимального размера т.к её нет
    }

    @Override
    /*monthly rate - 1% with USD and 2% with EUR*/
    public double getMonthlyRate() {
        if (getCurrency() == Currency.EUR)
            return 0.02;
        else
            return 0.01;
    }

    @Override
    /*commision - 5% if USD and up to 1000, 7% if USD and more than 1000-6% if EUR and up to 1000 and 8% if EUR and more than 1000*/
    public double getCommission(int amount) {
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return 0.05;
            else
                return 0.07;
        }else {
            if (amount <= 1000)
                return 0.06;
            else
                return 0.08;
        }
    }
}
