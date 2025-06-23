import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstMatch = br.readLine().split(" ");
        int p1 = Integer.parseInt(firstMatch[0]);
        int s1 = Integer.parseInt(firstMatch[1]);

        String[] secondMatch = br.readLine().split(" ");
        int s2 = Integer.parseInt(secondMatch[0]);
        int p2 = Integer.parseInt(secondMatch[1]);

        int totalP = p1 + p2;
        int totalS = s1 + s2;

        if (totalP > totalS) {
            System.out.println("Persepolis");
        } else if (totalP < totalS) {
            System.out.println("Esteghlal");
        } else {
            int awayGoalsP = p2;
            int awayGoalsS = s1;
            if (awayGoalsP > awayGoalsS) {
                System.out.println("Persepolis");
            } else if (awayGoalsP < awayGoalsS) {
                System.out.println("Esteghlal");
            } else {
                System.out.println("Penalty");
            }
        }
    }
}
