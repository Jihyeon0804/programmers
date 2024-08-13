import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array, int n) {
        
        List<Integer> list = Arrays.stream(array)
                                .boxed()
                                .collect(Collectors.toList()); 
        
        return Collections.frequency(list, n);
    }
}