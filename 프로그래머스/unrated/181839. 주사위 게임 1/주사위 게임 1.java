class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 0 && b % 2 == 0) { // 둘다 짝수일때
            if (a > b) {    // a가 더 크면
                answer = (a - b);   // a에서 b를
            }
            else {  // b가 더 크면
                answer = (b - a);   // b에서 a를 뺀다
            }
        }
        if (a % 2 != 0 || b % 2 != 0) { // a 혹은 b가 홀수라면
            answer = (a + b) * 2;   // 두 수의 합에 2를 곱한다
        }
        if (a % 2 != 0 && b % 2 != 0) { // a와 b 모두 홀수라면
            answer = (a *= a) + (b *= b);   // 각각의 제곱을 더한다
        }
        
        return answer;
    }
}