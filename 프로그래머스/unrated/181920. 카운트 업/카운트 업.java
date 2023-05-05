class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];    // start와 end까지의 수를 담을 answer배열 선언
        int index = 0;                          // answer배열의 index
        for (int i = start; i <= end; i++) {    // start부터 end까지 반복문 제어
            answer[index] = i;                  // answer에 순서대로 요소 삽입
            index++;                            // 삽입후 index 1씩 증가
        }
        
        return answer;
    }
}