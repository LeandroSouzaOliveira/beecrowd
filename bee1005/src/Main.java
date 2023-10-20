import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final double weightA = 3.5;
    private static final double weightB = 7.5;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double avg = ((A * weightA) + (B * weightB)) / (weightA + weightB);
        System.out.println("MEDIA = " + String.format("%.5f", avg));

        sc.close();
    }
}