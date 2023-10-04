package chapterFour.main;

public class TaxCalculator {
    private int totalTax;

    public int setTotalTax(int yearlyEarning) {
        if(yearlyEarning >0 && yearlyEarning <= 30000){
            int lessTaxRate = 15;
            totalTax = (yearlyEarning * lessTaxRate) / 100;
        }
        else{
            int highTaxRate = 20;
            totalTax = (yearlyEarning * highTaxRate) / 100;
        }
        return totalTax;
    }
}
