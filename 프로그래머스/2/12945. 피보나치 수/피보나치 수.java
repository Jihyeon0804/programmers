class Solution {
    public int solution(int n) {
        int answer = fibo(n) % 1234567;
        return answer;
    }
    
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }

        int m = 0;
        int k = 1;
        int l = 0;
        for (int i = 2; i <= n % 1234567; i++) {
            l = (m + k) % 1234567;
            m = k;
            k = l;
        }
        return l;
    }
}