import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        String interval = "Fora de intervalo";

        if (n >= 0 && n <= 25) {
            interval = "Intervalo [0,25]";
        }
        else if (n > 25 && n <= 50) {
            interval = "Intervalo (25,50]";
        }
        else if (n > 50 && n <= 75) {
            interval = "Intervalo (50,75]";
        }
        else if (n > 75 && n <= 100) {
            interval = "Intervalo (75,100]";
        }

        System.out.println(interval);
        sc.close();
    }
}
