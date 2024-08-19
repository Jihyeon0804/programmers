class Solution {
    public String solution(String myString) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = myString.toCharArray();
        
        for (char c : arr) {
            if (c - 0 < 108) {
                sb.append('l');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}