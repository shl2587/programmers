class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = a + b; // a와 b의 합을 초기값으로 설정
        if (flag == false) answer = a - b;  // flag가 false라면 두 수의 차를 answer에 저장
        return answer;  // flag의 결과값에 따라 반환
    }
}