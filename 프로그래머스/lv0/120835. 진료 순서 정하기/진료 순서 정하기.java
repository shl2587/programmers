import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int priority = 1;   // 우선순위 번호를 정할 priority 정수 변수 선언 및 1로 초기화
        // 비교 기준이 될 요소의 인덱스 i범위 설정
        for (int i = 0; i < emergency.length; i++) {
            // 비교 대상이 될 요소의 인덱스 j범위 설정
            for (int j = 0; j < emergency.length; j++) {
                // i번째 요소가 j번쨰 요소보다 작으면
                if(emergency[i] < emergency[j]){
                    // priority를 전위 방식으로 1증가
                    priority++;
                }
                // answer[i]에 priority를 저장
                answer[i] = priority;
            }
            // i의 인덱스 순위를 정하고 나서 다시 1로 초기화
            priority = 1;
        }
        
        return answer;
    }
}