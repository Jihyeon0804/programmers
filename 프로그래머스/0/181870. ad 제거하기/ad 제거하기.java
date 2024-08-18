import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>(Arrays.asList(strArr));

        list.removeIf(str -> str.contains("ad"));
        
        String[] answer = new String[list.size()];
        int idx = 0;
        for (String str : list) {
            answer[idx++] = str;
        }
        return answer;
    }
}