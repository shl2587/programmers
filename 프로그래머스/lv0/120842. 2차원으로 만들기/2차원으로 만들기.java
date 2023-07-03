class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;    // num_list의 인덱스를 제어할 idx 정수 변수 선언 및 0으로 초기화
        // 첫번째 인덱스를 i로 제어하고
        for(int i = 0; i < num_list.length/n; i++) {
            // 두번째 인덱스를 j로 제어
            for(int j = 0; j < n; j++) {
                // answer의 i번째 요소의 j번째 요소는 num_list의 idx번째 요소
                answer[i][j] = num_list[idx];
                // num_list의 인덱스 증가
                idx++;
            }
        }
        return answer;
    }
}