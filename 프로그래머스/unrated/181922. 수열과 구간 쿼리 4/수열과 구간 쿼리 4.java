class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        // 2차원 배열의 인덱스를 처리할 반복문 설정
        for (int j = 0; j < queries.length; j++) {
            int s = queries[j][0];  // i의 시작
            int e = queries[j][1];  // i의 끝
            // i의 범위를 설정
            for (int i = s; i <= e; i++) {
                // k에 queries[j]번째 요소의 마지막 요소를 저장
                int k = queries[j][2];
                // i가 k의 배수이면
                if (i % k == 0) {
                    // answer의 i번째 요소에 1을 더해서 저장
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}