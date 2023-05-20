class Solution {
    public int solution(int n) {
        int answer = 0; // 조건에 만족하는 모든 수의 합을 저장할 answer 선언 및 덧셈 항등원으로 초기화
        if (n % 2 == 0) {   // n이 짝수이면
            for (int i = 2; i <= n; i += 2) {   // 2부터 시작하여 2씩 커지는 반복 제어문 작성하여
                answer += (i * i);  // 지역변수 i의 제곱을 answer에 누적 합산
            }
        }
        else {  // n이 홀수면
            for (int i = 1; i <= n; i += 2) {   // 1부터 시작하여 2씩 커지는 홀수 반복 제어문 작성하여
                answer += i;    // 모든 홀수를 answer에 누적 합산
            }
        }
        
        return answer;
    }
}