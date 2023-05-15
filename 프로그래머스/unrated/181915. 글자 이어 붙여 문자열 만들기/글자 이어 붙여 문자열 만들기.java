import java.util.*;

class Solution {
    public String solution(String my, int[] index_list) {
        String answer = ""; // 정답을 담을 answer 문자열 변수 선언 및 빈문자열로 초기화
        for (int i = 0; i < index_list.length; i++) {   // index_list의 길이로 제어
            answer += String.valueOf(my.charAt(index_list[i])); // answer에 my문자열의 index_list[i]번째
                                                                // 정수의 인덱스의 값으로 누적 더함
        }
        
        return answer;
    }
}