import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[15];
        int max = 0;

        for (int i = 0; i < 15; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, a[i]);
        }

        boolean lastIsUniqueMax = (a[14] == max);

        for (int i = 0; i < 14; i++) {
            if (a[i] == max) {
                lastIsUniqueMax = false;
                break;
            }
        }

        System.out.println(lastIsUniqueMax ? max : max + 1);
    }
}