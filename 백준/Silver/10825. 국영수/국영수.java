import java.io.*;
import java.util.*;

public class Main {

    static class Score {
        String name;
        int koreanScore;
        int mathScore;
        int englishScore;


        public Score(String name, String koreanScore, String englishScore, String mathScore) {
            this.name = name;
            this.koreanScore = Integer.parseInt(koreanScore);
            this.englishScore = Integer.parseInt(englishScore);
            this.mathScore = Integer.parseInt(mathScore);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Score[] scores = new Score[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            scores[i] = new Score(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(scores, (o1, o2) -> {
            if (o1.koreanScore != o2.koreanScore) {
                return o2.koreanScore - o1.koreanScore;
            }

            else if (o1.englishScore != o2.englishScore) {
                return o1.englishScore - o2.englishScore;
            }

            else if (o1.mathScore != o2.mathScore) {
                return o2.mathScore - o1.mathScore;
            }

            else {
                return o1.name.compareTo(o2.name);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Score score : scores) {
            sb.append(score.name).append("\n");
        }

        System.out.println(sb);
    }
}