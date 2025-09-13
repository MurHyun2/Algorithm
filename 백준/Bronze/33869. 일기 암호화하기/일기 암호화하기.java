import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] inputSecureKey = br.readLine().toCharArray();
        char[] input = br.readLine().toCharArray();

        char[] alpArr = new char[26];
        LinkedHashSet<Character> secureKey = new LinkedHashSet<>();

        for (int i = 0; i < inputSecureKey.length; i++) {
            secureKey.add(inputSecureKey[i]);
        }

        int idx = 0;
        for (Character c : secureKey) {
            alpArr[idx++] = c;
        }

        char nowAlp = 'A';
        for (int i = secureKey.size(); i < 26; i++) {

            while (secureKey.contains(nowAlp)) {
                nowAlp++;
            }

            secureKey.add(nowAlp);
            alpArr[i] = nowAlp;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : input) {
            sb.append(alpArr[c - 'A']);
        }

        System.out.println(sb);
    }

}