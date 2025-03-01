import java.io.*;

public class Main {
    public static void main(String[] rgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char arr[][] = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != '\u0000') {
                    bw.write(arr[i][j]);
                }
            }
        }

        bw.flush();
    }
}
