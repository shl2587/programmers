class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {    // i를 idx로 하여 idx보다 큰 수를 확인
            if (arr[i] == 1) {  // arr의 i번째 요소가 1이면
                answer = i; // answer에 i를 저장
                break;  // 반복문 종료
            }
        }
        return answer;
    }
}