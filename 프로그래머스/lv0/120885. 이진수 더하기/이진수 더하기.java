import java.math.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // bin1과 bin2을 10진수로 변경
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        // 두수를 더한 값을 sum변수에 저장
        int sum = num1 + num2;
        
        // answer에 sum을 2진수로 변환하여 문자열 형태로 저장
        answer = Integer.toString(sum, 2);
        return answer;
    }
}