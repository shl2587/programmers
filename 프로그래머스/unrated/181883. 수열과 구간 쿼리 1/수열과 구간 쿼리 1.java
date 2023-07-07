class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i = 0; i < queries.length; i++) {   // queries의 일차원 배열 i 제어
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {   // answer의 인덱스 제어를 위한 반복문
                answer[j] += 1; // 해당 범위의 요소에 1을 더하여 저장
            }
        }
        
        return answer;
    }
}