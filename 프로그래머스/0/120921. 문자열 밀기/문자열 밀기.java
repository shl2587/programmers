import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if (A.equals(B)) {
            return 0;
        }
        
        int length = A.length();
        
        for (int i = 0; i < length; i++) {
            A = A.charAt(length - 1) + A.substring(0, length - 1);
            answer++;
            
            if (B.equals(A)) {
                return answer;
            }
        }
        
        return -1;
    }
}