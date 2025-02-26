import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}