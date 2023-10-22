import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;

        if (a < b) {
            x = a;
            a = b;
            b = x;
        }

        if (a % b == 0) {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
