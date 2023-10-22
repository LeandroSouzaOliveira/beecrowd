import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double sumOfAB = A + B;
        double sumOfAC = A + C;
        double sumOfBC = B + C;

        if (sumOfAB > C && sumOfAC > B && sumOfBC > A) {
            double perimeter = A + B + C;
            System.out.println("Perimetro = " + String.format("%.1f",perimeter));
        }
        else {
            double area = ((A + B) * C) / 2.0;
            System.out.println("Area = " + String.format("%.1f",area));
        }

        sc.close();
    }
}
