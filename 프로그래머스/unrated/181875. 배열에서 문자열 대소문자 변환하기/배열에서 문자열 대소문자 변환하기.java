class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];    // 정답을 반환할 strArr.length크기의 answer배열 선언
        for (int i = 0; i < strArr.length; i++) {   // 인덱스 통제할 지역변수 i를 기반으로 한 제어문
            if ( i % 2 == 0) {  // 해당 인덱스가 짝수이면
                answer[i] = strArr[i].toLowerCase();    // 모두 소문자로
            }
            if ( i % 2 != 0) {  // 홀수이면
                answer[i] = strArr[i].toUpperCase();    // 모두 대문자로 변환
            }
        }
        
        return answer;
    }
}