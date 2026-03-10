import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String oct = br.readLine();

        if (oct.equals("0")) {
            System.out.println("0");
            return;
        }

        String[] binary = {
            "000", "001", "010", "011",
            "100", "101", "110", "111"
        };

        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toBinaryString(oct.charAt(0) - '0'));

        for (int i = 1; i < oct.length(); i++) {
            sb.append(binary[oct.charAt(i) - '0']);
        }

        System.out.println(sb);
    }
}