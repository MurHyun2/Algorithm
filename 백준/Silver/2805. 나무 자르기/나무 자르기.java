import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] trees;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        trees = new int[N];

        // 나무 길이 입력 및 최댓값 계산
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max) {
                max = trees[i];
            }
        }

        // 결과 출력
        System.out.println(binarySearch(max));
    }

    private static long binarySearch(int max) {
        long left = 1;
        long right = max;
        long mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (canCut(mid)) {
                left = mid + 1;  // 자를 수 있다면 더 높은 값을 탐색
            } else {
                right = mid - 1; // 자를 수 없다면 낮은 값을 탐색
            }
        }

        return right;  // 최종적으로 자를 수 있는 최대 높이 반환
    }

    private static boolean canCut(long mid) {
        long sum = 0;

        // 각 나무에서 자를 수 있는 부분을 모두 더함
        for (int tree : trees) {
            if (tree >= mid) {
                sum += tree - mid;  // 나무를 자르고 나서 자른 길이만 더함
            }

            if (sum >= M) {
                return true;  // 자른 길이가 M 이상이면 바로 true 반환
            }
        }

        return false;  // M 이상으로 자를 수 없다면 false 반환
    }
}
