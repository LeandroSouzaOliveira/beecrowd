import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<Integer, Double> bills = new HashMap<>();
        bills.put(1, 4.00);
        bills.put(2, 4.50);
        bills.put(3, 5.00);
        bills.put(4, 2.00);
        bills.put(5, 1.50);

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        if (bills.containsKey(code)) {
            double value = bills.get(code);
            double total = quantity * value;
            System.out.println("Total: R$ " + String.format("%.2f", total));
        }
        else {
            System.out.println("Chave não encontrada " + code);
        }

        sc.close();
    }
}
