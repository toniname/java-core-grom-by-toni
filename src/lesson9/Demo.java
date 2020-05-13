package lesson9;



public class Demo {
    public static void main(String[] args) {
        Company company = new Company("IBM", "Canada");
        System.out.println(company.countryFounded);
        System.out.println(company.name);

        company.name = "IBM";
        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.name));
       // System.out.println(checker.companyNamesValidatedCount);

    }
}
