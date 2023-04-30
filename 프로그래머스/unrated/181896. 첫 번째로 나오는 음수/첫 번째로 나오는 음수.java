class Solution {
    public int solution(int[] num_list) {
        int answer = -1; // 배열에 음수값이 없다면 전달할 -1을 기본값으로 초기화
        for (int i = 0; i < num_list.length; i++) { // 배열 인덱스를 통제하기 위한 반복문 제어
            if (num_list[i] < 0) {      // 해당 배열의 요소가 음수이면
                answer = i;             // answer 변수에 해당 요소의 인덱스 값을 전달하고
                break;                  // 반복문을 중단하여 최초의 음수요소의 인덱스를 반환하도록 설정
            }
        }
        return answer;
    }
}