import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int firstProduct = A * B;
        int secondProduct = C * D;

        int diferenca = firstProduct - secondProduct;
        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}