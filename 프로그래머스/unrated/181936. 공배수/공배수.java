class Solution {
    public int solution(int number, int n, int m) {
        // && 연산자를 통하여 두 조건이 모두 만족한다면
        // 공배수가 되므로 1을 반환
        // 아니면 0을 반환
        int answer = number % n == 0 && number % m == 0 ? 1 : 0;
        return answer;
    }
}