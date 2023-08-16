class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() / n;  // answer의 길이는 my_str의 길이에서 n을 나눈값
        // 나누어 떨어지지 않는다면 len에 1을 더해줌
        if (my_str.length() % n != 0) {
            len = my_str.length() / n + 1;
        }
        
        String[] answer = new String[len];
        int idx = 0;    // my_str의 substring 인덱스를 통제할 idx정수변수 선언 및 0으로 초기화
        
        for (int i = 0; i < len; i++) {
            // 마지막 값의 길이가 n보다 작을 경우 my_str.length()앞까지만 substring
            if (idx + n > my_str.length()) {
                answer[i] = my_str.substring(idx, my_str.length());
            }
            else {
                answer[i] = my_str.substring(idx, idx+n);
            }
            // idx에 n을 더해줌
            idx+=n;
        }
        
        return answer;
    }
}