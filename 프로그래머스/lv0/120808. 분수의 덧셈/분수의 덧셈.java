class Solution {
    public int[] solution(int n1, int dn1, int n2, int dn2) {
        // value1에는 분자의 덧셈을
        int value1 = (n2*dn1 + n1*dn2);
        // value2에는 분모의 공배수를 저장
        int value2 = (dn1*dn2);
        // answer 정수 배열을 value1, value2로 선언
        int[] answer = {value1, value2};
        
        // value1이 value2보다 작으면
        if (value1 < value2) {
            // value1값까지의 반복문을 작성하여(1부터 시작하는 이유는 0은 분모에 올 수 없음)
            // - value1까지 반복하는 이유는 최소 공배수를 찾는 과정이기 때문
            for (int i = 1; i <= value1; i++) {
                // value1과 value2를 i로 나누어 0이되면
                if(value1 % i == 0 && value2 % i == 0) {
                    // 분모와 분자에 i를 나누어 저장
                    answer[0] = value1 / i;
                    answer[1] = value2 / i;
                }
            }
        }
        else {  // value2가 더 작으면
            // value2까지 반복하여
            for (int i = 1; i <= value2; i++) {
                // value1과 value2를 i로 나누어 0이되면
                if(value1 % i == 0 && value2 % i == 0) {
                    // 분모와 분자에 i를 나누어 저장
                    answer[0] = value1 / i;
                    answer[1] = value2 / i;
                }
            }
        }
                
        
        return answer;
    }
}