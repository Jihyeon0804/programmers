class Solution {
    public String solution(String my_string) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        for (char c : arr) {
            if (my_string.contains("" + c)) {
                my_string =  my_string.replace("" + c, "");
            }
        }
        return my_string;
    }
}