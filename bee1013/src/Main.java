import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int greaterThanTwo = (A + B + Math.abs(A - B)) / 2;
        int greaterThanThree = (greaterThanTwo + C + Math.abs(greaterThanTwo - C)) / 2;

        System.out.println(greaterThanThree + " eh o maior");

        sc.close();
    }
}