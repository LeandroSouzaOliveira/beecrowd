import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        List<Integer> sorts = Arrays.asList(x, y, z);
        List<Integer> sortedList = sorts.stream().sorted().toList();

        sortedList.forEach(System.out::println);
        System.out.println();
        sorts.forEach(System.out::println);

        sc.close();
    }
}
