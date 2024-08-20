class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string, 0, num1);
        sb.append(my_string, num2, num2+1);
        sb.append(my_string, num1 + 1, num2);
        sb.append(my_string, num1, num1 + 1);
        sb.append(my_string, num2 + 1, my_string.length());
        
        return sb.toString();
    }
}