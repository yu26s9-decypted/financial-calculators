import java.util.Scanner;

public class FinancialCalculator {

    public static Scanner scanner = new Scanner(System.in);

//    Software could grow beyond initial assignment/scope. Suggestion: askForDouble/ askForString for future proof so it will align and fall into good organization.
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double borrowAmount = askMortgageQuestion("How much are you borrowing $");
        double yearPeriod = askMortgageQuestion("Over how many periods in years ");
        double interestRate = askMortgageQuestion("At what interest rate? %");
        double userMortgage = mortgageCalculator(borrowAmount, interestRate, (int) yearPeriod);
        double userInterest = mortgageTotalInterestCalculator(borrowAmount, userMortgage, (int) yearPeriod);
        double userTotalPayment = borrowAmount + userInterest;
        System.out.printf("You are borrowing $%,.2f for %.0f year at a %.2f%% interest",borrowAmount, yearPeriod, interestRate);
        System.out.printf("\nYour payment is $%,.2f/mo and your total interest would be $%,.2f. Your total payment is $%,.2f", userMortgage, userInterest, userTotalPayment);
    }

    public static double mortgageCalculator(double principle, double interest, int loanLength){
        double i = interest / 100 / 12;
        int n = loanLength * 12;
        return principle * (i * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1));
    }



    public static double mortgageTotalInterestCalculator(double principle, double monthlyPayment, int loanLength){
        return (monthlyPayment * (loanLength * 12)) - principle;
    };

//    What are we rlly calc here? What is monthly payment of mortgage. Instead of currentname, maybe more about calculateMonthlyPayment


    public static double askMortgageQuestion(String question){
        System.out.print(question);
        return scanner.nextDouble();

        // Preemptive next line. Put nextDouble in var and print nextline to never leave a crlf on the scanner. If a person ask a string error it won't cause a bug that might be tricky to troubleshoot.
        // Defensive programming (May not have given us valid data and we want to make it so they are least likely to run into error.
    }

//    Try to do the third bonus
}
