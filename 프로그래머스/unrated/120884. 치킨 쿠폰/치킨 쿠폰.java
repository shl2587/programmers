class Solution {
    public int solution(int chicken) {
        // 반복문 시작 시 1이 증가하므로 -1로 초기화
        int answer = 0;
        // chicken먹은 수만큼 반복하고 10씩 증가
        for (int i = 10; i <= chicken; i+=10) {
            // answer은 혜택을 받은수
            answer++;
            // 10번당 쿠폰 사용 시 다시 쿠폰을 주므로 chicken을 1증가
            chicken++;
        }
        return answer;
    }
}