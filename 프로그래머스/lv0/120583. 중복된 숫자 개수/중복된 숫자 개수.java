class Solution {
    public int solution(int[] array, int n) {
        int answer = 0; // 중복 개수를 저장하기위한 answer변수 선언 및 초기화
        for (int i = 0; i < array.length; i++){ // 비교를 위한 배열 인덱스 통제를 위한 
            if (array[i] == n) {    // 배열의 요소와 매개변수 n과 동일하면
                answer++;           // answer에 카운트
            }
        }
        
        return answer;
    }
}