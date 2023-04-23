class Solution {
    public int solution(int n) {
        int answer = 0; // answer을 덧셈 항등원 0으로 초기화
        for (int i = 2; i <= n; i+=2) { // for 반복문에서 지역변수 i를 2로 초기화하고
                                        // 2씩 증가시켜 짝수만 추출
            answer += i;                // answer변수에 저장
        }
        return answer;  // 해당 값을 반환
    }
}