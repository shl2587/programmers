public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n != 0) {
            answer += (n % 10); // 나머지로 자리수를 누적 덧셈
            n /= 10;        // 몫으로 누적 나눗셈하여 자리수 정리 
        }
        
        return answer;
    }
}