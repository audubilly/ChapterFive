public class ModifiedCompoundInterest {

    public double calculateCompoundInterestOfSingleYear(double principal, double rate, double year) {
//        double amount = 1;
//        double principal = 1000.0;
//        double rate = 0.05;
//        int year = 1;
        double amount = principal * Math.pow(1.0 + rate, year);
        return amount;
    }


    public double varyTheRates(int lowestRate, int highestRate) {
        double amount =0.0;
        double rateInDecimal;
        for (int rate = lowestRate; rate <= highestRate; rate++) {
            rateInDecimal = rate/100.0;
            System.out.printf("%.2f %.2f%n", rateInDecimal, calculateCompoundInterestForTenYears(rateInDecimal));
        }
        return amount;
    }


    public double calculateCompoundInterestForTenYears(double rate) {
        double amount = 0;
        double principal = 1000.0;
        //double rate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
//            amount = principal * (Math.pow(1.0 + rate, year));
            amount += calculateCompoundInterestOfSingleYear(principal, rate, year);
            System.out.printf("%4d%, 20.2f%n", year, amount);
        }
        return amount;
    }


}