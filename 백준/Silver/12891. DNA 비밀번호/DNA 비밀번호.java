import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] inputArr = br.readLine().toCharArray();
        int[] minUsed = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minUsed[i] = Integer.parseInt(st.nextToken());
        }

        int ans = cntPW(inputArr, minUsed, p);

        System.out.println(ans);
    }

    private static int cntPW(char[] inputArr, int[] minUsed, int p) {
        int[] usedCnt = new int[4];
        int cnt = 0;

        for (int i = 0; i < p; i++) {
            usedCnt[getDNA(inputArr[i])]++;
        }

        if (check(usedCnt, minUsed)) {
            cnt++;
        }

        for (int i = p; i < inputArr.length; i++) {
            usedCnt[getDNA(inputArr[i])]++;
            usedCnt[getDNA(inputArr[i - p])]--;
            if (check(usedCnt, minUsed)) {
                cnt++;
            }
        }

        return cnt;
    }

    private static boolean check(int[] usedCnt, int[] minUsed) {
        for (int i = 0; i < 4; i++) {
            if (minUsed[i] > usedCnt[i]) {
                return false;
            }
        }

        return true;
    }

    private static int getDNA(char c) {
        switch (c) {
            case 'A' : return 0;
            case 'C' : return 1;
            case 'G' : return 2;
            case 'T' : return 3;
        }
        
        return -1;
    }
    
}