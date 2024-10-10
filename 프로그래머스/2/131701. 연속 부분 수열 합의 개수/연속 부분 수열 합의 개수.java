import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
         Set<Integer> set = new HashSet<>();
        int len = 1;
        
        while (len <= elements.length) {
            int sum = 0;
            int cnt = 0;
            
            for (int i = 0; i < elements.length * 2; i++) {
                cnt++;
                sum += elements[i % elements.length];
                
                if (cnt == len) {
                    set.add(sum);
                    cnt = 0;
                    sum = 0;
                    i -= (len - 1);
                }

            }
            len++;
        }
        return set.size();
    }
}