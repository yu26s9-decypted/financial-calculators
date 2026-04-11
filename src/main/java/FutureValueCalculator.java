import java.util.Scanner;

public class FutureValueCalculator {
    public static double futureValueCalculator(double depositValue, double interestRate, int numberOfYears){
        return depositValue * Math.pow( 1 + ((interestRate / 100 )/ 365), (365 * numberOfYears));
    }



    public static double askQuestions(String question, Scanner scanner){
        System.out.print(question);
        return scanner.nextDouble();

    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        double depositAmount = askQuestions("How much will you be depositing? $", scanner);
        double cdYieldRate = askQuestions("What's the interest rate of the CD: ", scanner);
        double depositYearLength = askQuestions("How long is the CD? ", scanner);
        double futureValue = futureValueCalculator(depositAmount, cdYieldRate, (int) depositYearLength);
        double interestEarned = futureValue - depositAmount;
        System.out.printf("You are putting in $%,.2f at a rate of %.2f%% for %.0f years. In %.0f years your cd will be worth $%,.2f. You've earned $%.2f in interest", depositAmount,  cdYieldRate, depositYearLength, depositYearLength, futureValue, interestEarned);


    }
}
