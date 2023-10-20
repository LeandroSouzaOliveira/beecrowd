import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle = A * C / 2.0;
        double circle = PI * Math.pow(C, 2);
        double trapeze = ((A + B) * C) / 2.0;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
        System.out.println("CIRCULO: " + String.format("%.3f", circle));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeze));
        System.out.println("QUADRADO: " + String.format("%.3f", square));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangle));

        sc.close();
    }
}