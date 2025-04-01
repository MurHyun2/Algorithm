import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> gradeMap = Map.of(
                "A+", 4.5, "A0", 4.0, "B+", 3.5, "B0", 3.0,
                "C+", 2.5, "C0", 2.0, "D+", 1.5, "D0", 1.0,
                "F", 0.0, "P", 0.0
        );

        double total = 0;
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                total += score * gradeMap.get(grade);
                sum += score;
            }
        }

        System.out.printf("%.6f\n", total / sum);
    }
}