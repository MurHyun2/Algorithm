import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int K, N;
    static int[] cables;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        cables = new int[K];

        // 랜선 길이 입력 및 최댓값 계산
        int max = 0;
        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            if (cables[i] > max) {
                max = cables[i];
            }
        }

        // 결과 출력
        System.out.println(binarySearch(max));
    }

    private static int binarySearch(int max) {
        long low = 1;    // 랜선 최소 길이
        long high = max; // 랜선 최대 길이
        long mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (canCut(mid)) {
                low = mid + 1; // 랜선 길이를 늘림
            } else {
                high = mid - 1; // 랜선 길이를 줄임
            }
        }

        return (int) high; // 최적의 길이 반환
    }

    private static boolean canCut(long length) {
        long count = 0;

        // mid 길이로 자른 랜선 개수 계산
        for (int cable : cables) {
            count += cable / length;
            if (count >= N) { // 조건 충족 시 종료
                return true;
            }
        }

        return false;
    }
}
