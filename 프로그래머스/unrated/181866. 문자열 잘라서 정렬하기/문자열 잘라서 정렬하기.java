import java.util.*;

class Solution {
    public ArrayList<String> solution(String myString) {
        ArrayList<String> answer = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < myString.length(); i++) {   // myString의 길이만큼 반복 회수 제어
            if ('x' == myString.charAt(i)) {    // x가 myString의 i번째 문자열과 같다면
                if (!tmp.equals("")) {
                    answer.add(tmp);    // answer 리스트에 tmp 추가    
                }
                tmp = "";   // tmp를 빈문자열로 저장
            }
            else {  // tmp의 누적 덧셈을 제어하기 위해한 else조건문
                tmp += myString.charAt(i);  // tmp에 myString의 i번째 문자열을 누적 덧셈
                if (i == myString.length() - 1) {   // i가 myString의 마지막 문자열의 인덱스와 같다면               
                    answer.add(tmp);    // tmp를 answer 마지막 배열에 저장
                }
            }
        }
        
        answer.sort(null);
        return answer;
    }
}