import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int firstPartCode = sc.nextInt();
        int quantityOne = sc.nextInt();
        double firstUnitValue = sc.nextDouble();
        double firstTotal = quantityOne * firstUnitValue;

        int secondPartCode = sc.nextInt();
        int quantityTwo = sc.nextInt();
        double secondUnitValue = sc.nextDouble();
        double secondTotal = quantityTwo * secondUnitValue;

        double total = firstTotal + secondTotal;
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

        sc.close();
    }
}