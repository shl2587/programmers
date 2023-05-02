class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];  // n번까지의 배열을 반환해야하므로 정수 n을 길이로하는 배열 선언
        for (int i = 0; i < n; i++) {   // 0번부터 n-1까지 인덱스 통제
            answer[i] = num_list[i];    // 0번부터 n-1까지의 배열 요소 삽입
        }
        return answer;
    }
}