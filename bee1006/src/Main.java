import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final double weightA = 2.0;
    private static final double weightB = 3.0;
    private static final double weightC = 5.0;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double sum = (A * weightA) + (B * weightB) + (C * weightC);
        double weight = weightA + weightB + weightC;
        double avg = sum / weight;

        System.out.println("MEDIA = " + String.format("%.1f", avg));

        sc.close();
    }
}