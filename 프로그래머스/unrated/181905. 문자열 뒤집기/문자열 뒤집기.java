import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String first = my_string.substring(0, s);
        String last = my_string.substring(e+1);
        answer = my_string.substring(s, e+1);
        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        answer = first + answer + last;
        
        
        
        return answer;
    }
}