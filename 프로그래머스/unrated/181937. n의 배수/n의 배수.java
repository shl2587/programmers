class Solution {
    public int solution(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;  // 삼항연산자를 활용한 n의 배수 확인
        return answer;
    }
}