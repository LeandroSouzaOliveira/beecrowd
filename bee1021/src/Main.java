import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        int[] bills = new int[]{100, 50, 20, 10, 5, 2};
        double[] coins = new double[]{1.0, 0.5, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int bill : bills) {
            int count = (int) Math.floor(n / bill);
            n = n % bill;
            System.out.println(count + " nota(s) de R$ " + bill + ".00");
        }

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int count = (int) Math.floor(n / coin);
            n = n % coin;
            System.out.println(count + " moeda(s) de R$ " + String.format("%.2f",coin));
        }

        sc.close();
    }
}
