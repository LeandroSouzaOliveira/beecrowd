import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int value = n;

        int hundred = n / 100;
        n = n % 100;
        int fifty = n / 50;
        n = n % 50;
        int twenty = n / 20;
        n = n % 20;
        int tem = n / 10;
        n = n % 10;
        int five = n / 5;
        n = n % 5;
        int two = n / 2;
        n = n % 2;
        int one = n;

        System.out.println(value);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(tem + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");

        sc.close();
    }
}

/* 1º versão:
int hundred = n / 100;
int fifty = (n % 100) / 50;
int twenty = (n - (hundred * 100) - (fifty * 50)) / 20;
int tem = (n - (hundred * 100) - (fifty * 50) - (twenty * 20)) / 20;
int five = (n - (hundred * 100) - (fifty * 50) - (twenty * 20) - (tem * 10)) / 5;
int two = (n - (hundred * 100) - (fifty * 50) - (twenty * 20) - (tem * 10) - (five * 5)) / 2;
int one = (n - (hundred * 100) - (fifty * 50) - (twenty * 20) - (tem * 10) - (five * 5) - (two * 2));
*/

/* Versão da ChatGpt:
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] denominations = {100, 50, 20, 10, 5, 2, 1};

         System.out.println(n);
        for (int denomination : denominations) {
            int count = n / denomination;
            n = n % denomination; // Atualiza o valor de n para o restante
            System.out.println(count + " nota(s) de R$ " + denomination + ",00");
        }

        sc.close();
    }
}
*/