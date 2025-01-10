import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        // 토핑 종류 count
        Set<Integer> preSet = new HashSet<>();
        Set<Integer> postSet = new HashSet<>();
        int[] toppingCnt = new int[topping.length];
        for (int i = 0; i < topping.length; i++) {
            preSet.add(topping[i]);
            toppingCnt[i] = preSet.size();
        }

        // 뒤에서부터 토핑 개수 세면서 서로 다른 토핑의 종류가 같으면 answer++
        for (int i = topping.length - 1; i > 0; i--) {
            postSet.add(topping[i]);
            if (toppingCnt[i - 1] == postSet.size()) {
                answer++;
            }
        }

        return answer;
    }
}
