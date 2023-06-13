class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {   // n 나누기 i의 나머지가 1이면
                answer = i; // answer에 i를 저장
                break;
            }
        }
        return answer;
    }
}