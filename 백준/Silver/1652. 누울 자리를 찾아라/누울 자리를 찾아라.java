import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int rCnt = countRowSpace(map, n);
        int cCnt = countColSpace(map, n);

        System.out.println(rCnt + " " + cCnt);
    }

    private static int countRowSpace(char[][] map, int n) {
        int rCnt = 0;
        for (int i = 0; i < n; i++) {

            int cnt = 0;
            for (int j = 0; j < n; j++) {

                if(map[i][j] == '.') cnt++;
                else cnt = 0;

                if(cnt == 2) rCnt++;
            }
        }

        return rCnt;
    }

    private static int countColSpace(char[][] map, int n) {
        int cCnt = 0;
        for (int i = 0; i < n; i++) {

            int cnt = 0;
            for (int j = 0; j < n; j++) {

                if(map[j][i] == '.') cnt++;
                else cnt = 0;

                if(cnt == 2) cCnt++;
            }
        }

        return cCnt;
    }
    
}