import java.util.*;
import java.io.*;

// 과일 종류는 1~9
// 과일 종류는 2종류 이하
// 2종류 이하일 경우 maxLen 구하기
// N 은 1~200,000, 시간 제한은 2초
// 따라서 n log n 이하만 가능
// 투포인터 사용
// HashMap을 사용해서 과일별 갯수 저장
// HashMap size가 3이상일 경우 포인터 이동 및 해당 과일 --.
// 해당 과일이 0일 경우 HashMap에서 삭제.

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];
        Map<Integer, Integer> freq = new HashMap<>();
        int maxLen = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }
        // 입력 끝
        
        int left = 0;
        
        for(int right = 0; right < N; right++) {
            int x = fruits[right];
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            
            while(freq.size() > 2) {
                int y = fruits[left];
                freq.put(y, freq.get(y) - 1);
                if (freq.get(y) == 0) freq.remove(y);
                left++;
            }
                     
            maxLen = Math.max(maxLen, right - left + 1);
        }
                     
        System.out.println(maxLen);
    }
}