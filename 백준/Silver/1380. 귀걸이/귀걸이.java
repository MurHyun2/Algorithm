import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int scenario = 0;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                return;
            } else {
                scenario++;
            }

            ArrayList<String> girls = new ArrayList<>(); 

            // 여학생들의 이름 입력
            for (int i = 0; i < n; i++) {
                girls.add(br.readLine());
            }

            ArrayList<Integer> lostEarrings = new ArrayList<>();

            // 여학생들의 귀걸이 상태 입력
            for (int i = 0; i < n * 2 - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                if (lostEarrings.contains(num)) {
                    lostEarrings.remove((Integer) num);
                } else {
                    lostEarrings.add(num);
                }
            }

            int lostGirlIndex = lostEarrings.get(0); 


            System.out.println(scenario + " " + girls.get(lostGirlIndex - 1));
        }
    }
}