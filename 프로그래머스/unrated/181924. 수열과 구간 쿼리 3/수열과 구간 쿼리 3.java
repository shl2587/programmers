class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i = 0; i < queries.length; i++) {
            int tmp = 0;    // 순서 변경을위해 임시로 변경할 정수 변수 tmp선언 및 0으로 초기화
            // tmp에 answer의 queries[i][0]번째 요소를 저장
            tmp = answer[queries[i][0]];
            // answer[queries[i][0]]에 answer[queries[i][1]]를 저장하고
            answer[queries[i][0]] = answer[queries[i][1]];
            // tmp의 값을 answer[queries[i][1]]에 저장하여 순서 교체
            answer[queries[i][1]] = tmp;
        }
        return answer;
    }
}