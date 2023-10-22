import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final int AUTONOMY = 12;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int timeSpent = sc.nextInt();
        int averageSpeed = sc.nextInt();

        int travelledDistance = timeSpent * averageSpeed;
        double spentFuel = (double) travelledDistance / AUTONOMY;

        System.out.printf("%.3f%n",spentFuel);

        sc.close();
    }
}