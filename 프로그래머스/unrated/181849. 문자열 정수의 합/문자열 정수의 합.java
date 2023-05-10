class Solution {
    public int solution(String num_str) {
        String num;
        int answer = 0;
        
        for(int i = 0; i < num_str.length(); i++) {  // num_str의 길이로 반복횟수 제어
            num = String.valueOf(num_str.charAt(i));        // 각 자리수 문자열을 num문자열
            answer += Integer.parseInt(num);        // 각 자리수 문자열을 정수로 변환하여
                                                    // 복합대입연산자로 누적 덧셈
        }
        return answer;
    }
}