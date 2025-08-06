import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
		int d1= Integer.parseInt(reader.readLine());
		int d2= Integer.parseInt(reader.readLine());
		
        System.out.println((d1 * 2) + (d2 * 2 * 3.141592));
	
    }
}