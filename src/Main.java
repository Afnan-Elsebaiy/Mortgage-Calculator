import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    final static int PERCENT = 100;
    final static int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float AnnualInterestRates;
        int principal;
        float AnnualInterestRate;
        int period;
        double Mortgage;
        String result;
        int periodOfYear;

        while (true) {
            System.out.print("Principal: ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1000000) {
                break;
            }
            System.out.println("Enter a number between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            AnnualInterestRate = sc.nextFloat();
            if (AnnualInterestRate >= 1 && AnnualInterestRate <= 30) {
                AnnualInterestRates = AnnualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal 30");

        }
        while (true) {
            System.out.print("Period: ");
            period = sc.nextInt();
            if (period >= 1 && period <= 30) {
                periodOfYear = period * MONTHS_IN_YEAR;
                Mortgage = principal
                        * (AnnualInterestRates * Math.pow(1 + AnnualInterestRates, periodOfYear))
                        / (Math.pow(1 + AnnualInterestRates, periodOfYear) - 1);
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                result = currency.format(Mortgage);
                printTotal(result);

                break;
            }
            System.out.println("Enter a value between 1 and  30");
        }

        periodOfYear = period * MONTHS_IN_YEAR;
        for (short i = 1; i <= periodOfYear; i++) {
            double x = remainingBalance(i, principal, AnnualInterestRates, periodOfYear);
            // System.out.println(Mortgage );
            System.out.println(NumberFormat.getCurrencyInstance().format(x));
        }
    }




    public static void printTotal(String result) {
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly Payment :" + result);
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
    }
 //1,822.41 , 180000 , 0.033 , 120
    public static double remainingBalance(double totalMonthlyPayment, int principal, float annual_interest_rate, float numberOfPayments) {
double payment_schedule = principal * (Math.pow(1 + annual_interest_rate, numberOfPayments) 
                - Math.pow(1 + annual_interest_rate, totalMonthlyPayment)) 
                / (Math.pow(1 + annual_interest_rate, numberOfPayments) - 1);
        return payment_schedule;
    }
}
