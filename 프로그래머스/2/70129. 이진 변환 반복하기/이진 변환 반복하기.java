import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zeroCnt = 0;

        while (!s.equals("1")) {
            cnt++;
            int len = s.length();
            s = s.replace("0", "");
            zeroCnt += len - s.length();    // 제거된 0의 개수

            s = Integer.toBinaryString(s.length()); // 길이 2진수 변환

        }

        answer[0] = cnt;
        answer[1] = zeroCnt;
        return answer;
    }
}