class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {  // 매개변수 n까지의 범위로 반복문 제어
            if (n % i == 0) {           // n을 지역변수 i로 나누면서 약수를 찾음
                answer++;               // 조건 통과시 answer를 1씩 카운트
            }
        }
        
        return answer;
    }
}