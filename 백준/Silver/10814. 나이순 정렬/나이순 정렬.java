import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            members[i][0] = input[0];
            members[i][1] = input[1];
        }

        Arrays.sort(members, (m1, m2) -> Integer.parseInt(m1[0]) - Integer.parseInt(m2[0]));

        StringBuilder sb = new StringBuilder();
        for (String[] member : members) {
            sb.append(member[0]).append(" ").append(member[1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
