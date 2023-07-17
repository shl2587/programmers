class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        // 이중 for문을 활용하여
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {   // 각각의 인덱스가 k보다 작거나 같다면
                    answer += board[i][j];  // answer에 복합대입연산자를 통한 덧셈
                }
            }
        }
        return answer;
    }
}