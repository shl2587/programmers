class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = 0;   // answer i번째 j번째 요소에 0을 저장
                if (i == j) {   // i와 j가 같으면
                    answer[i][j] = 1;   // 1을 저장
                }   
            }
        }
        
        return answer;
    }
}