import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String tmp = "";    // my_string의 접미사를 임시저장하기 위한
                            // tmp 문자열 변수 선언 및 빈문자열로 초기화
        
        // my_string.length만큼 반복횟수 제어
        for (int i = 0; i < my_string.length(); i++) {
            tmp = "";   // 아래 조건문 및 코드가 모두 실행된 후 tmp에 빈문자열 저장
            // j에 i를 저장하여 앞의 문자열 부터 제외 시키며 모든 접미사를 저장하기 위한 반복문
            for (int j = i; j < my_string.length(); j++) {
                tmp += my_string.charAt(j); // 해당 반복문 제어문만큼 my_string의 문자열을 tmp에 저장
            }
            answer[i] = tmp;    // answer의 i번째 요소에 tmp 저장
        }
        Arrays.sort(answer);    // 사전 순 정렬을 위한 오름차순 정렬
        return answer;
    }
}