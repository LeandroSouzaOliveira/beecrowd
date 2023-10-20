import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final double n = 3.14159;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ray = sc.nextDouble();

        double area = n * Math.pow(ray, 2);
        System.out.println("A=" + String.format("%.4f", area));

        sc.close();
    }
}