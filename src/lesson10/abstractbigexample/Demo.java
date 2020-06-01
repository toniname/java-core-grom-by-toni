package lesson10.abstractbigexample;

public class Demo {
    public static void main(String[] args) {
        //вывод значений
        BankAccount bankAccount = new BankAccount(new Employee() {
            @Override
            void paySalary() {

            }
        }, 324);
        System.out.println(bankAccount);

        Company company = new Company("company");
        System.out.println(company);

        DeveloperEmployee developerEmployee = new DeveloperEmployee();
        System.out.println(developerEmployee.getBankAccount());

        EmployeeController employeeController = new EmployeeController();
        System.out.println(employeeController);

        ManagerEmployee managerEmployee = new ManagerEmployee();
        System.out.println(managerEmployee.getSalaryPerMonth());
        System.out.println(managerEmployee.getBalance());


    }
}
