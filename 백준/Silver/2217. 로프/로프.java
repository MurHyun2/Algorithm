import java.util.*;
import java.io.*;

// N 1~100,000, K 1~10,000 시간 제한은 2초이므로 O(n^2) 이하만 가능
// w/k 했을시 최대 중량을 구해야함
// 각 로프의 최대 중량들을 정렬 O(n log n) 한뒤 그리디 방식으로 하나씩 더해서 풀이
// 기존값보다 더 한 뒤의 무게가 더 작다면 종료 후 최대값 반환

// 입력: 로프의 개수, 각 로프의 최대 중량
// 출력: 최대 무게
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        long maxWeight = 0;

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        // 입력 끝

        list.sort(Comparator.reverseOrder());
        maxWeight = list.get(0);

        for (int i = 1; i < N; i++) {
            long weight = (long) list.get(i) * (i + 1);
            if (weight > maxWeight) maxWeight = weight;
        }

        System.out.println(maxWeight);
    }
}