class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];    // 카운트할 수를 배열의 크기로 설정
        int index = 0;    // 인덱스를 통제할 정수 변수 index 선언 및 0으로 초기화
        for (int i = start; i != end-1; i--) {    // 지역변수 i를 start로 하여 end까지 1씩 감소하는 제어문
            answer[index] = i;  // answer 배열의 index번째에 start를 저장
            index++;            // index를 1증가
        }
        return answer;
    }
}