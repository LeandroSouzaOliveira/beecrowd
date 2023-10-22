import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int year = age / 365;
        age = age % 365;
        int month = age / 30;
        age = age % 30;
        int day = age;

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");

        sc.close();
    }
}
