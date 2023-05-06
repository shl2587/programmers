class Solution {
    public int[] solution(int n) {
        // n이 곧 배열의 길이이므로
        int size = (n % 2 == 0) ? n / 2 : n / 2 + 1;    // n을 2로 나누어 나머지가 없으면 짝수 크기이므로
                                                        // n / 2 의 크기를 가지게하고
                                                        // n이 홀수이므로 n / 2 몫에 1을 더해준다
        int[] answer = new int[size];       // answer 배열에 크기를 삽입
        for (int i = 0; i < size; i++) {
            answer[i] = i * 2 + 1;          // i에 2배수 해주고 1을 더해주면 홀수가 되므로 answer배열에 저장
        }
        
        
        return answer;
    }
}