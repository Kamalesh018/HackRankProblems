import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment =  sc.nextDouble();
        String u = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //wrong//String india = NumberFormat.getCurrencyInstance(Locale.i).format(payment);
        String i = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        System.out.println("US: " +u);
        System.out.println("India: " +i);
        System.out.println("China: " +c);
        System.out.println("France: " +f);
    }
}
