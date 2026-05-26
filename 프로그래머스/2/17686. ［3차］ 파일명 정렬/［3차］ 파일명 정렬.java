import java.util.*;

class Solution {
    
    class File {
        String fileName;
        String head;
        int number;
        
        File(String fileName, String head, int number) {
            this.fileName = fileName;
            this.head = head;
            this.number = number;
        }
    }
    
    public String[] solution(String[] files) {
        
        File[] file_items = new File[files.length];

        int i = 0;
        
        for (String file : files) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
           
            int idx = 0;
            while (idx < file.length() && !Character.isDigit(file.charAt(idx))) {
                sb.append(file.charAt(idx));
                idx++;
            }
            
            while (idx < file.length() && Character.isDigit(file.charAt(idx))) {
                sb2.append(file.charAt(idx));
                idx++;
            }
            
            file_items[i] = new File(file, sb.toString().toUpperCase(), Integer.parseInt(sb2.toString()));
            i++;
        }
        
        Arrays.sort(file_items, (a, b) -> {
            if (!a.head.equals(b.head)) {
                return a.head.compareTo(b.head);
            }
            
            if (a.number != b.number) {
                return Integer.compare(a.number, b.number);    
            }
            
            return 0;
        });
        
        String[] answer = new String[files.length];
        
        for (int j = 0; j < files.length; j++) {
            answer[j] = file_items[j].fileName;
        }
        
        return answer;
    }
}
