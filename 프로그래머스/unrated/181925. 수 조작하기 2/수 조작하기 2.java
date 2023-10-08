class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] == (numLog[i-1] + 1)) { // 이전 숫자와 비교하여 1이 크면
                answer += 'w';  // w를 덧셈
            }
            else if(numLog[i] == (numLog[i-1] - 1)) { // 이전 숫자와 비교하여 1이 작으면
                answer += 's';  // s를 덧셈
            }
            else if(numLog[i] == (numLog[i-1] + 10)) {  // 이전 숫자와 비교하여 10이 크면
                answer += 'd';  // d를 덧셈
            }
            else if(numLog[i] == (numLog[i-1] - 10)) {  // 이전 숫자와 비교하여 10이 작으면
                answer += 'a';  // a를 덧셈
            }
        }
        return answer;
    }
}