import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            list.add(Long.parseLong(t.substring(i, p.length() + i)));
        }
        
        for (long n : list) {
            if (n <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}