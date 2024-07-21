import java.util.*;

class Solution { 
    static List<List<Integer>> list = new ArrayList<>();
    
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];
        List<List<Integer>> result = new ArrayList<>();
        combination(number, visited, 0, number.length, 3);
        for (List<Integer> lst : list) {
            int cnt = lst.get(0);
            for (int j = 1; j < lst.size(); j++) {
                cnt += lst.get(j);
            }

            if (cnt == 0) {
                result.add(lst);
            }

        }
        return result.size();
    }
    
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            List<Integer> comb_list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    comb_list.add(arr[i]);
                }
            }
            list.add(comb_list);

            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}