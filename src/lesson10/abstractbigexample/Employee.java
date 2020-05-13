package lesson10.abstractbigexample;

import javax.swing.text.Position;

public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;

    private String curPosition;

    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];

    abstract void paySalary();

    void changePosition(String newPosition) {
        //сохранить текущую позицию в историю
        // поменять позицию
        savePositionToHistory(); //вызов отдельного метода для сохранения позиции
        curPosition = newPosition; //смена позиции
    }

    private void savePositionToHistory() { //метода для сохранения позиции
        int i = 0;
        for (String pos : positionsWorked) { //перебор позиций
            if (pos == null) { // если позиция равна налу, т.е. есть пустое место
                positionsWorked[i] = curPosition; //то в пустое место записать текущую позицию
                break;     // остановка метода
            }
            i++;  // след итерация
        }
    }

    int getBalance() {
        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() { //для получения BankAccount
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}
