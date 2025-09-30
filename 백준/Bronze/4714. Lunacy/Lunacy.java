import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            double weight = Double.parseDouble(line);
            if (weight < 0) {
                break;
            }
            double moonWeight = weight * 0.167;
            System.out.println("Objects weighing " + String.format("%.2f", weight) + " on Earth will weigh " + String.format("%.2f", moonWeight) + " on the moon.");
        }
        br.close();
    }
}
