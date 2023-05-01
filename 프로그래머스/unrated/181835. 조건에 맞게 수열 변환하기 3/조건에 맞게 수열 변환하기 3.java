class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length]; // 정답을 담을 answer배열 선언 및 크기 설정
        for (int i = 0; i < arr.length; i++) {  // 배열의 길이로 반복회수 제어
            if (k % 2 == 0) {                   // 매개변수 k가 짝수라면
                answer[i] = arr[i] + k;         // 각 요소에 k를 더하여 answer배열에 저장
            }
            else {                              // 홀수라면
                answer[i] = arr[i] * k;         // 각 요소에 k를 곱하여  answer배열에 저장
            }
        }
        
        return answer;
    }
}