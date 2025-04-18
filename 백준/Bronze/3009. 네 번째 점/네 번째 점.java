import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(findMissingCoordinate(x) + " " + findMissingCoordinate(y));
        bw.flush();
    }

    static int findMissingCoordinate(int[] arr) {
        return arr[0] == arr[1] ? arr[2] : arr[0] == arr[2] ? arr[1] : arr[0];
    }
}