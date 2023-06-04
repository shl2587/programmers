class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;    // 피자 판수를 정할 cnt 정수 변수 선언 및 0으로 초기화
        while(true) {   // 무한반복 실행
            cnt++;     // cnt를 1씩 증가
            if ((cnt * 6) % n == 0) {   // 6조각에 cnt판을 곱하여 n으로 나누어 0이되면
                                        // 피자 판수의 최소값이 됨
                answer = cnt;           // answer에 cnt를 저장하고
                break;                  // 반복문 종료
            }
        }
        return answer;
    }
}