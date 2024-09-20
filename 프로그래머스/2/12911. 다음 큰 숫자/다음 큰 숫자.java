class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binary = Integer.toBinaryString(n);
        int nLen = binary.length();
        int oneCount = binary.replace(String.valueOf('0'), "").length(); // 1의 개수
        
        for (int i = n + 1; i <= 1000000; i++) {
            String s = Integer.toBinaryString(i);
            String newS = s.replace(String.valueOf('0'), "");
            if (newS.length() == oneCount) {
                answer =  Integer.parseInt(s, 2);
                break;
            }
        }
        return answer;
    }
}