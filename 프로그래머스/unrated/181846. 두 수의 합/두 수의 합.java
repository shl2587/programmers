import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        // 두수를 저장하고 문자열로 변환
        BigDecimal decimal_a = new BigDecimal(a);
        BigDecimal decimal_b = new BigDecimal(b);
        
        // 두 수를 덧셈
        BigDecimal result = decimal_a.add(decimal_b);
        
        // 결과를 문자열로 변환하되 지수 표현식 제거
        answer = result.toPlainString();
        return answer;
    }
}