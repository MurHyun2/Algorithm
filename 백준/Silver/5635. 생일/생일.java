import java.io.*;
import java.util.*;

public class Main {

    static class Student {
        String name;
        int day, month, year;

        Student(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            students.add(new Student(name, day, month, year));
        }

        students.sort((a, b) -> {
            if (a.year != b.year) return b.year - a.year;
            if (a.month != b.month) return b.month - a.month;
            return b.day - a.day;
        });

        System.out.println(students.get(0).name);
        System.out.println(students.get(students.size() - 1).name);
    }
}