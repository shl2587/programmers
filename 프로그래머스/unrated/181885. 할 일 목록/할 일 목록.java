class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0; // answer 배열의 크기를 정할 정수 length 선언
        String[] answer = null;
        for (int i = 0; i < finished.length; i++) {     // finished의 크기만큼 반복회수 제어
                                                        // - answer의 크기를 정해주기 위한 반복문
            if (finished[i] == false) { // finished i번째 요소의 값이 false이면
                length++;   // 길이를 1씩 증가
            }
        }
        answer = new String[length];    // answer에 배열의 크기를 넣어 생성
        int index = 0;  // answer의 배열을 통제할 index 정수 변수 선언 및 0으로 초기화
        for (int i = 0; i < todo_list.length; i++) {    // todo_list의 크기만큼 반복수 제어
            if (finished[i] == false) {  // finished의 i번째 배열이 false이면
                answer[index] = todo_list[i];    // todo_list의 i번째 요소가 일을 마치지 못한 것이므로
                                                // answer의 index번째에 삽입
                index++;    // index를 1 증가
            }
        }
        
        
        return answer;
    }
}