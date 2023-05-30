import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int PERCENT = 100;
        final int MONTHS_IN_YEAR = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = sc.nextInt();
        System.out.print("Annual Interest Rate: ");
        float AnnualInterestRate = sc.nextFloat()/PERCENT/MONTHS_IN_YEAR;
        System.out.print("Period: ");
        int periodOfYear = sc.nextInt()*MONTHS_IN_YEAR;
        float Mortgage =principal*(AnnualInterestRate*(float) Math.pow(1+AnnualInterestRate,periodOfYear))/((float)Math.pow(1+AnnualInterestRate,periodOfYear)-1);
//        System.out.println("$"+Mortgage);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(Mortgage);
        System.out.println(result);

    }
}