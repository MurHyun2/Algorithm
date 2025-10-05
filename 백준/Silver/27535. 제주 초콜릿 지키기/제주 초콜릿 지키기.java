import java.io.*;
import java.util.*;

public class Main {
    static class Chocolate {
        int num;
        int index;
        String text;
        Chocolate(int num, int index, String text) {
            this.num = num;
            this.index = index;
            this.text = text;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            input.add(line);
        }

        int[] order = {2, 4, 0, 3, 1};
        String[] labels = {"H", "T", "C", "K", "G"};
        String[] nums = input.get(0).split(" ");
        List<Chocolate> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(new Chocolate(Integer.parseInt(nums[i]), order[i], labels[i]));
        }

        List<int[]> eatList = new ArrayList<>();
        for (int i = 2; i < input.size(); i++) {
            String[] parts = input.get(i).split(" ");
            int[] arr = new int[parts.length];
            for (int j = 0; j < parts.length; j++) arr[j] = Integer.parseInt(parts[j]);
            eatList.add(arr);
        }

        int sum = list.stream().mapToInt(c -> c.num).sum();
        int base = sum % 10 <= 1 ? 10 : sum % 10;

        for (int[] eat : eatList) {
            sum = 0;
            for (int i = 0; i < list.size(); i++) {
                list.get(i).num -= eat[i];
                sum += list.get(i).num;
            }

            List<Chocolate> remaining = new ArrayList<>();
            for (Chocolate c : list) if (c.num > 0) remaining.add(c);

            remaining.sort((a, b) -> b.num == a.num ? a.index - b.index : b.num - a.num);

            StringBuilder orderStr = new StringBuilder();
            for (Chocolate c : remaining) orderStr.append(c.text);

            System.out.println(Integer.toString(sum, base) + "7H");
            System.out.println(orderStr.length() > 0 ? orderStr.toString() : "NULL");

            base = sum % 10 <= 1 ? 10 : sum % 10;
        }
    }
}
