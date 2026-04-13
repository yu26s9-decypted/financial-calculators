import java.util.InputMismatchException;
import java.util.Scanner;

// CLEARER NAMING CONVENTION?
public class AnnuityCalculator {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double monthlyPayout = askForDouble("What is your desired monthly payout? $");
        double expectedInterest = askForDouble("What is your expected interest? (in percentages): ");
        double payoutTimeInYears = askForDouble("How many years until payout? (yrs): ");
        double presentAnnuityValue  = calculatePresentAnnuity(monthlyPayout, expectedInterest, (int)payoutTimeInYears);

        System.out.printf("To fund a annuity that pays $%,.2f for %.0f years and earn an expected %.2f%% interest, you would need to invest $%,.2f today.", monthlyPayout, payoutTimeInYears, expectedInterest, presentAnnuityValue);
    }

    public static double calculatePresentAnnuity(double monthlyPayout, double expectedInterest, int payoutYearLength){
        double r = expectedInterest / 100 / 12;
        double n = payoutYearLength * 12;
        return monthlyPayout * (1 - Math.pow(1 + r, -n)) / r;
    }



    // Defensive Programming, future proofing variable names
//

    public static double askForDouble(String prompt){
        System.out.printf(prompt);
        double value = 0;
        boolean isValidInput = false;
        while (!isValidInput){
            try {
                value = scanner.nextDouble();
                scanner.nextLine();
                isValidInput = true;

//                Input Mismtch try catch block: checks if the user input data matches the expected datatype.
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.printf("Err: There is a input mismatch, please type your input again: %s", prompt);
            }
        }
        return value;
    }


}
