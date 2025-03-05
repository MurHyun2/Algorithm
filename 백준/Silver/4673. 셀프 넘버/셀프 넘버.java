public class Main {
    public static void main(String[] args) {
        boolean[] selfNumber = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) {
                selfNumber[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!selfNumber[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}