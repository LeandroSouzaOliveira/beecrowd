import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int startHours = a * 3600;
        int startMinutes = b * 60;
        int endHours = c * 3600;
        int endMinutes = d * 60;

        int secondStart = startHours + startMinutes;
        int secondEnd = endHours + endMinutes;

        int duration = 0;

        if (secondStart == secondEnd) {
            duration = 86400;
        }
        else if (secondStart > secondEnd) {
            duration = (86400 - secondStart) + secondEnd;
        } else {
            duration = secondEnd - secondStart;
        }

        int durationHours = duration / 3600;
        duration = duration % 3600;
        int durationMinutes = duration / 60;

        System.out.println("O JOGO DUROU " + durationHours + " HORA(S)" + " E " + durationMinutes + " MINUTO(S)");

        sc.close();
    }
}
