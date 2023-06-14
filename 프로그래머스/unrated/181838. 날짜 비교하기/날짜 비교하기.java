class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        if (date1[0] < date2[0]) {  // 배열 각각의 i번째 요소를 비교하여
            answer = 1; // date1[i]가 더 작으면 answer에 1을 저장
        }
        else if (date1[0] == date2[0] && date1[1] < date2[1]) {
            answer = 1;
        }
        else if (date1[1] == date2[1] && date1[2] < date2[2]) {
            answer = 1;
        }
        return answer;
    }
}