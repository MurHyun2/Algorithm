import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>(); // 듣도 못한 사람들의 이름 저장
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(); // 듣도 보도 못한 사람들의 이름 저장
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (set.contains(input)) {
                list.add(input);
            }
        }

        list.sort(String::compareTo); // 사전 순 정렬

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n"); // 결과의 크기 출력
        for (String s : list) {
            sb.append(s).append("\n"); // 이름 출력
        }

        System.out.println(sb.toString()); // 최종 결과 출력
    }
}
