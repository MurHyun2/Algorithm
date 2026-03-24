import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour * 60 + minute;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int CP_START = 6 * 60 + 30;
        int TEN = 10 * 60;         
        int SIXTEEN = 16 * 60;     
        int CP_END = 19 * 60;      

        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int t = toMinutes(br.readLine());

            if (CP_START <= t && t <= CP_END) {
                first = Math.min(first, t);
                last = Math.max(last, t);
            }
        }

        if (first == Integer.MAX_VALUE) {
            System.out.println(0);
            return;
        }

        int answer;

        if (first <= TEN) {
            if (last <= SIXTEEN) {
                answer = 24000;
            } else {
                answer = 36000;
            }
        } else {
            if (last <= SIXTEEN) {
                answer = 16800;
            } else {
                answer = 24000;
            }
        }

        System.out.println(answer);
    }
}