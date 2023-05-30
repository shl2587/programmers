import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_str) {
        ArrayList<String> list = new ArrayList<>();
        String tmp = "";    // 공백 이전까지의 문자열을 저장할 tmp 선언 및 빈 문자열 초기화
        // my_str.length()만큼 반복문 횟수 제어
        for (int i = 0; i < my_str.length(); i++) {
            if (!String.valueOf(my_str.charAt(i)).equals(" ")) {    // 빈문자열이 아니면
                tmp += my_str.charAt(i);    // tmp에 my_str문자열 공백 이전까지 저장하는 코드
                if(i == my_str.length() - 1) list.add(tmp); // 마지막 문자열 저장
            }
            // my_str의 i번째 문자열이 빈 문자열이면
            if (!tmp.equals("") && String.valueOf(my_str.charAt(i)).equals(" ")) {
                list.add(tmp);  // list에 추가
                tmp = "";   // 빈 문자열 tmp에 저장
            }
        }
        return list;
    }
}