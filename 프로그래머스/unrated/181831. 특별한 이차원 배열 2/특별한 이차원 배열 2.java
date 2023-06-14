class Solution {
    public int solution(int[][] arr) {
        int answer = 1; // 정답을 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {   // 다른 요소가 하나라도 있으면
                    answer = 0; // answer에 0을 저장하고
                    break;      // 반복문 종료
                }
            }
        }
        return answer;
    }
}