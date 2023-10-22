import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double firstInOrder = x2 - x1;
        double secondInOrder = y2 - y1;

        double distance = Math.sqrt(Math.pow(firstInOrder,2) + Math.pow(secondInOrder,2));
        System.out.printf("%.4f%n",distance);

        sc.close();
    }
}