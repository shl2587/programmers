class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr; // answer배열에 arr요소를 담아줌
        
        if (arr.length % 2 == 0) {   // arr.length이 짝수이면
            for (int i = 1; i < arr.length; i+=2) { // answer 배열 홀수번째 인덱스에
                answer[i] = arr[i] + n; // arr의 홀수번째 인덱스 요소에 n을 더한 값을 저장
            }
        }
        else {  // arr.length이 홀수이면
            for (int i = 0; i < arr.length; i+=2) { // answer 배열 짝수번째 인덱스에
                answer[i] = arr[i] + n; // arr의 짝수번째 인덱스 요소에 n을 더한 값을 저장
            }
        }
        return answer;
    }
}