import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a1 = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= a1; i++) {
        	for (int j = 0; j < i; j++) {
        		bw.write("*");		
			}
        	bw.write("\n");
        }
        bf.close();
        bw.close();
    }
}
