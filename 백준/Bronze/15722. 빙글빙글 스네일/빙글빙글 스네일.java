import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] now = {0, 0};
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int dir = 0;
        int repeat = 1;
        int second = 0;

        while(second < N) {

            for (int j = 0; j < repeat; j++) {

                now[0] += dr[dir];
                now[1] += dc[dir];
                second++;

                if (second == N) {
                    break;
                }
            }

            dir = (dir + 1) % 4;

            if(dir == 0 || dir == 2) {
                repeat++;
            }
        }

        System.out.println(now[0] + " " + now[1]);
    }
}