import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        if (score.length < k) {
            for (int i = 0; i < score.length; i++) {
                list.add(score[i]);
                answer[i] = Collections.min(list);
            }
        } else {
            for (int i = 0; i < k; i++) {
                list.add(score[i]);
                answer[i] = Collections.min(list);
            }
        
        
            for (int i = k; i < score.length; i++)  {
                Collections.sort(list);
                if (list.get(0) < score[i]) {
                    list.remove(0);
                    list.add(score[i]);
                }
                answer[i] = Collections.min(list);
            }
        }

        return answer;
    }
}