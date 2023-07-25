import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String alpha = "abcdefghijklmnopqrstuvwxyz";    // 각 문자열이 포함되어 있는지 확인하기 위한 문자열
        String num = "";    // 문자열 속 정수를 추출하기 위한 num 문자열 변수 선언 및 빈문자열 초기화
        String my = my_string.toLowerCase();    // 비교하기 위해 전부 소문자로 전환하여 my문자열에 저장
        // my문자열 길이만큼 반복문 실행
        for (int i = 0; i < my.length(); i++) {
            // 문자열 str을 선언하고 문자열을 저장하여 계속 초기화
            String str = String.valueOf(my.charAt(i));
            // alpha에 str이 포함되어 있지않으면
            if (!alpha.contains(str)) {
                // num 문자열에 덧셈
                num += str;
                // 마지막 인덱스에 해당하면
                if (i == my.length() -1) {
                    // answer에 num을 덧셈
                    answer += Integer.parseInt(num);
                }
            }
            // else if를 통해 num에 빈문자열일 경우 parseInt오류를 피하기 위해 제어문 작성
            else if (!num.equals("")){
                // answer에 num을 덧셈
                answer += Integer.parseInt(num);
                // num을 빈문자열로 초기화
                num ="";
            }
        }
        
        return answer;
    }
}