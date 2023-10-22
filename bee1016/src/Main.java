import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();

        int time = distance * 2;

        System.out.println(time + " minutos");

        sc.close();
    }
}