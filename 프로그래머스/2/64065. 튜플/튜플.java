import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 중괄호 제거한 문자열
        s = s.replaceAll("[{}]", "");

        // 문자열 => int 배열
        int[] arr = Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).toArray();

        // 각 요소의 개수 count
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        // 값 기준으로 내림차순 정렬
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        // 내림차순 lambda 식
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        return keySet.stream().mapToInt(Integer::intValue).toArray();
    }
}