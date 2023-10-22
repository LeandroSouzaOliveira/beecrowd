import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String quadrant = "";

        if (x == 0.0 && y == 0) {
            quadrant = "Origem";
        }
        else if (y == 0.0 && x > 0.0) {
            quadrant = "Eixo X";
        }
        else if (x == 0.0 && y > 0.0) {
            quadrant = "Eixo Y";
        }
        else if (x > 0.0 && y > 0.0) {
            quadrant = "Q1";
        }
        else if (x < 0.0 && y > 0.0) {
            quadrant = "Q2";
        }
        else if (x < 0.0 && y < 0.0) {
            quadrant = "Q3";
        }
        else if (x > 0.0 && y < 0.0) {
            quadrant = "Q4";
        }

        System.out.println(quadrant);

        sc.close();
    }
}
