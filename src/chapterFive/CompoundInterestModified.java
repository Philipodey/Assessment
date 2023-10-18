package chapterFive;

public class CompoundInterestModified{
    public static void main(String[] args) {
        double principal = 1000.00;
        double rate = 0.05;
        int year = 1;
        System.out.printf("%s%20s%n", "Rate", "Amount on deposit");
        for (double interestRate = 0.05; interestRate <= 0.10; interestRate += 0.01) {
            double amount = principal * Math.pow(1.0 + interestRate, year);
            System.out.printf("%.2f%20.2f%n",interestRate,amount);
        }

    }
}
