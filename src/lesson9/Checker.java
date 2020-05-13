package lesson9;

public class Checker {
    private int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {

        if(companyNamesValidatedCount > 10)
            return false;

        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";


        // if (companyName == "Google" || companyName == "Amazon")
        // return false;
        // return true; //  эквивалентно коду с низу
        // return companyName != "Google" && companyName != "Amazon";
    }
}
