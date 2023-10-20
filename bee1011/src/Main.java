import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ray = sc.nextInt();

        double volume = 4 / 3.0 * PI * Math.pow(ray, 3);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

        sc.close();
    }
}