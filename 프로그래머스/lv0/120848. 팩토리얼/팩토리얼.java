class Solution {
    public int solution(int n) {
        int answer = 0; // 팩토리얼 숫자를 담당
        int num = 1;    // 항등원으로 사용
        
        while(num <= n) {    // num이 n보다 작으면 반복수행
            answer++;   // answer에 1을 더하고
            num *= answer;  // num의 팩토리얼 결과로 저장
        }
        if (num != n) { // num과 n이 같지 않다면 answer에 결과값보다 1이 많게 나오기 때문에
            answer--;   // answer이 1을 감소
        }
        return answer;
    }
}