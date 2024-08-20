import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                list.add(i);
            } else if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for (int i : list) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}