import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            long s = sc.nextLong();

            System.out.println(s / (n + 1));
        }

        sc.close();
    }
}