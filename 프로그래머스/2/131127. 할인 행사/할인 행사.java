import java.util.Arrays;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        String[] goods = new String[10];
        int idx = 0;
        for (int i = 0; i < want.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                goods[idx++] = want[i];
            }
        }
        Arrays.sort(goods);


        for (int i = 0; i <= discount.length - 10; i++) {
            String[] test = Arrays.copyOfRange(discount, i, i+10);
            Arrays.sort(test);
            if (Arrays.equals(test, goods)) {
                answer++;
            }
        }
        
        return answer;
    }
}