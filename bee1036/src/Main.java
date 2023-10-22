import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            double delta = Math.pow(b, 2) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Impossivel calcular");
            }
            else {
                double rail = Math.sqrt(delta);
                double r1 = (-b + rail) / (2 * a);
                double r2 = (-b - rail) / (2 * a);

                if (Double.isNaN(r1) || Double.isNaN(r2)) {
                    System.out.println("Impossivel calcular");
                }
                else {
                    System.out.println("R1 = " + String.format("%.5f", r1));
                    System.out.println("R2 = " + String.format("%.5f", r2));
                }
            }
        }

        sc.close();
    }
}
