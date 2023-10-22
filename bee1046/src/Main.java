import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int duration = 0;

        if (start == end) {
            duration = 24;
        }
        else if (start > end) {
            duration = (24 - start) + end;
        }
        else {
            duration = end - start;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

        sc.close();
    }
}
