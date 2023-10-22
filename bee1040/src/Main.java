import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double avg = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        double newAvg = 0.0;
        System.out.println("Media: " + String.format("%.1f",Math.floor(avg * 10) / 10));

        if (avg >= 5.0 && avg < 7.0) {
            System.out.println("Aluno em exame.");
            double exam = sc.nextDouble();
            System.out.println("Nota do exame: " + String.format("%.1f", exam));
            newAvg = (avg + exam) / 2.0;
        }

        if (newAvg >= 5.0) {
            System.out.println("Aluno aprovado.");
            System.out.println("Media final: " + String.format("%.1f", newAvg));
        }
        else if (avg >= 7.0) {
            System.out.println("Aluno aprovado.");
        }
        else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
