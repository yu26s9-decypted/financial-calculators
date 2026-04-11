import java.util.Scanner;

public class FinancialCalculator {

    public static double mortgageCalculator(double principle, double interest, int loanLength){
       double i = interest / 100 / 12;
       int n = loanLength * 12;

       return principle * (i * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1));




    }

    public static double mortgageTotalInterestCalculator(double principle, double monthlyPayment, int loanLength){
        return (monthlyPayment * (loanLength * 12)) - principle;

    };

    public static double askMortgageQuestion(String question, Scanner scanner){
        System.out.print(question);
        return scanner.nextDouble();

    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double borrowAmount = askMortgageQuestion("How much are you borrowing $", scanner);
        double yearPeriod = askMortgageQuestion("Over how many periods in years ", scanner);
        double interestRate = askMortgageQuestion("At what interest rate? %", scanner);
        double userMortgage = mortgageCalculator(borrowAmount, interestRate, (int) yearPeriod);
        double userInterest = mortgageTotalInterestCalculator(borrowAmount, userMortgage, (int) yearPeriod);
        double userTotalPayment = borrowAmount + userInterest;
        System.out.printf("You are borrowing $%,.2f for %.0f year at a %.2f%% interest",borrowAmount, yearPeriod, interestRate);
        System.out.printf("\nYour payment is $%,.2f/mo and your total interest would be $%,.2f. Your total payment is $%,.2f", userMortgage, userInterest, userTotalPayment);



    }
}
