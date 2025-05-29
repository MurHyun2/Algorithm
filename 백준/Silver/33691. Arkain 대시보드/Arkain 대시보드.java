import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        LinkedHashMap<String, Integer> lastUsed = new LinkedHashMap<>();
        
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            lastUsed.put(name, i);
        }

        int K = Integer.parseInt(br.readLine());
        Set<String> fixed = new HashSet<>();
        
        for (int i = 0; i < K; i++) {
            fixed.add(br.readLine());
        }

        List<String> fixedList = new ArrayList<>();
        List<String> normalList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : lastUsed.entrySet()) {
            String name = entry.getKey();
            if (fixed.contains(name)) {
                fixedList.add(name);
            } else {
                normalList.add(name);
            }
        }

        fixedList.sort((a, b) -> lastUsed.get(b) - lastUsed.get(a));
        normalList.sort((a, b) -> lastUsed.get(b) - lastUsed.get(a));

        for (String name : fixedList) {
            System.out.println(name);
        }
        
        for (String name : normalList) {
            System.out.println(name);
        }
    }
}