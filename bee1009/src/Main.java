import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final double percCommission = 0.15;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double salesAmount = sc.nextDouble();

        double commission = salesAmount * percCommission;
        double salary = baseSalary + commission;

        System.out.println("TOTAL = R$ " + String.format("%.2f", salary));

        sc.close();
    }
}