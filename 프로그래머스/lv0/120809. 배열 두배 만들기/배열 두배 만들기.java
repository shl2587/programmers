class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers; //정답을 반환할 배열에 매개변수 배열로 초기화
        for (int i = 0; i < answer.length; i++) {   // 인덱스 통제를 위한 answer.length크기 미만으로 제어문 작성
            answer[i] *= 2;         // 복합 대입연산자를 통해 각 요소에 두배를 해주고 저장
        }
        return answer;  
    }
}