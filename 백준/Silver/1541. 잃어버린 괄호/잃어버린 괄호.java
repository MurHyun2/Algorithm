import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // '-'를 기준으로 나누기
        String[] parts = input.split("-");

        // 첫 번째 부분은 모두 더함
        int sum = 0;
        String[] firstPart = parts[0].split("\\+");
        for (String num : firstPart) {
            sum += Integer.parseInt(num);
        }

        // 이후 부분은 모두 더한 뒤 빼줌
        for (int i = 1; i < parts.length; i++) {
            String[] subPart = parts[i].split("\\+");
            int subSum = 0;
            for (String num : subPart) {
                subSum += Integer.parseInt(num);
            }
            sum -= subSum;
        }

        // 결과 출력
        System.out.println(sum);
    }
}
