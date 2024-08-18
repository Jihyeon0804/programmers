import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list  = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        for (int n : delete_list) {
            for (int i = 0; i < list.size(); i++) {
                if (n == list.get(i)) {
                    list.remove(i);
                    i--;
                }
            }
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        for (int i : list) {
            answer[idx++] = i;
        }
        return answer;
    }
}