import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[ ] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT =100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Principle: ");
        int principle = scanner.nextInt();

        System.out.println("Please enter Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT/MONTHS_IN_YEAR;


        System.out.println("Please enter Years: ");
        byte years = scanner.nextByte();
        int numOfPayment = years*MONTHS_IN_YEAR;



        double mortgage = principle
                *(monthlyInterest*Math.pow(1+monthlyInterest,numOfPayment))
                /(Math.pow(1+monthlyInterest,numOfPayment)-1);
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Mortgage is: "+ mortgageFormated);
}
}

