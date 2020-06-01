package lesson10.abstractbigexample;

import java.util.Arrays;

public class DeveloperEmployee extends Employee { // extends для того чтобы перенимал все свойства общего Employee
    private String [] frameworks = new String[10]; // просто колличество фреймворков

    @Override // так как  расчитывается по другому то делаем перезапись
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);

    }

    @Override
    public String toString() {
        return "DeveloperEmployee{" +
                "frameworks=" + Arrays.toString(frameworks) +
                '}';
    }
}
