import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        
        List<String> str1List = getStringList(str1);
        List<String> str2List = getStringList(str2);
        
        if (str1List.isEmpty() && str2List.isEmpty()) {
            return 65536;
        }

        List<String> str1Copy = new ArrayList<>(str1List);
        List<String> str2Copy = new ArrayList<>(str2List);
        
        for (String s : str1Copy) {
            str2Copy.remove(s);
        }   // B - A
        
        int inter = str2List.size() - str2Copy.size();  // 교집합
        
        str1List.addAll(str2List); // 합집합(중복포함)
        
        int union = str1List.size() - inter; // 중복 제거

        int answer = (int) Math.floor((double)inter / union * 65536);
        
        return answer;
    }
    
    // 영문자만 포함된 다중집합 생성 메서드
    static List<String> getStringList(String str) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String s = str.substring(i, i + 2).toLowerCase();
            if (Pattern.matches("^[a-zA-Z]*$", s)) {
                strList.add(s);
            }
        }

        return strList;
    }
}