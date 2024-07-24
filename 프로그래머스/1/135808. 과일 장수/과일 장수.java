import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int s : score) {
            list.add(s);
        }
        Collections.sort(list);
        List<List<Integer>> appleBox = new ArrayList<>();
        while (list.size() > m) {
            List<Integer> apple = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                apple.add(list.get(list.size() - 1));
                list.remove(list.size() - 1);
            }
            appleBox.add(apple);
        }
        
        
        if (list.size() == m) {
            appleBox.add(list);
        }
        
        for (List<Integer> l : appleBox) {
            answer += Collections.min(l) * m;
        }
        return answer;
    }
}