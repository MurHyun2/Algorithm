import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int count = 0;

            for (int i = 0; i <= n - 4; i++) {
                if (arr[i] == 2 && arr[i+1] == 0 && arr[i+2] == 2 && arr[i+3] == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
