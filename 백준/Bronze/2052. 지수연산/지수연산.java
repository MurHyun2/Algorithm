import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());
		double ans = Math.pow(0.5, n);
		
        BigDecimal bd = new BigDecimal(ans);
        
        bd = bd.setScale(n, RoundingMode.HALF_UP);

		bw.write(bd.toPlainString());
		bw.flush();
	}
}