import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfElem = Integer.parseInt(br.readLine());
        List<Integer> numList = Stream.of(br.readLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(numList.stream().max(Comparator.naturalOrder()).get());
    }
}