class Solution {
    public int solution(int num) {
        int answer = 0;
        // num이 홀수가 연속되서 나올 경우 int자료형을 벗어나 숫자가 임의로 줄어드는 경우 방지
        long number = num;
        // number가 1이 아닐때 까지 반복
        // 이때 number가 1이면 반복을 수행하지 않아 answer가 0으로 반환
        while(number != 1) {
            // number가 짝수이면 2의 몫을 number에 저장
            if(number % 2 == 0) {
                number /= 2;
            }
            // 홀수이면 3을 곱하고 1을 더하여 저장
            else {
                number = number * 3 + 1;
            }
            // 반복 될때 마다 answer가 1증가
            answer++;
            // answer가 500회를 넘어가게 되면
            if (answer > 500) {
                // answer에 -1을 저장하고
                answer = -1;
                // 중단
                break;
            }
        }
        return answer;
    }
}