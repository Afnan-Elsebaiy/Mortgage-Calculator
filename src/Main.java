import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int PERCENT = 100;
        final int MONTHS_IN_YEAR = 12;
        Scanner sc = new Scanner(System.in);

        float AnnualInterestRates;
        int principal;
        float AnnualInterestRate;
        int period;


        while (true) {
            System.out.print("Principal: ");
            principal = sc.nextInt();
            if(principal >= 1000 && principal <= 1000000) {
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
//                        System.out.println(AnnualInterestRate);
                    }
                    System.out.println("Enter a value greater than 0 and less than or equal 30");

                }
                        while (true) {
                            System.out.print("Period: ");
                            period = sc.nextInt();
                            if (period >= 1 && period <= 30) {
                                 int periodOfYear = period * MONTHS_IN_YEAR;
//                                System.out.println(periodOfYear);
                                float Mortgage =principal*(AnnualInterestRates*(float) Math.pow(1+AnnualInterestRates,periodOfYear))/((float)Math.pow(1+AnnualInterestRates,periodOfYear)-1);
                                NumberFormat currency = NumberFormat.getCurrencyInstance();
                                String result = currency.format(Mortgage);
                                System.out.println(result);
                                break;
                            }
                            System.out.println("Enter a value between 1 and  30");

                        }

    }
}