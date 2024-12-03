import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            result += c * d;
        }
        if (result == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}