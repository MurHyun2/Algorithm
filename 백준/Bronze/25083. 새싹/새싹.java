import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.append("         ,r'\"7");
		bw.newLine();
		bw.append("r`-_   ,'  ,/");
		bw.newLine();
		bw.append(" \\. \". L_r'");
		bw.newLine();
		bw.append("   `~\\/");
		bw.newLine();
		bw.append("      |");
		bw.newLine();
		bw.append("      |");
		
		bw.flush();
		bw.close();
	}
}
