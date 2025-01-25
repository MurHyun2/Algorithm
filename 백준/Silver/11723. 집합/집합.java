import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine().trim());
        Set<Integer> emptySet = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().trim().split(" ");
            String command = input[0];

            switch (command) {
                case "add":
                    emptySet.add(Integer.parseInt(input[1]));
                    break;
                case "remove":
                    emptySet.remove(Integer.parseInt(input[1]));
                    break;
                case "check":
                    sb.append(emptySet.contains(Integer.parseInt(input[1])) ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    int value = Integer.parseInt(input[1]);
                    if(emptySet.contains(value)) {
                        emptySet.remove(value);
                    } else {
                        emptySet.add(value);
                    }
                    break;
                case "all":
                    emptySet.clear();
                    for (int j = 1; j <= 20; j++) {
                        emptySet.add(j);
                    }
                    break;
                case "empty":
                    emptySet.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}