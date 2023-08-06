class Solution {
    public int solution(String s) {
        int answer = 0;
        // strArr문자열 배열에 " "을 제외한 요소들을 삽입
        String[] strArr = s.split(" ");
        // strArr을 반복하여
        for (int i = 0; i < strArr.length; i++) {
            // "Z"가 아닌 요소들은
            if (!"Z".equals(strArr[i])) {
                // 정수로 변환하여 answer에 덧셈
                answer += Integer.parseInt(strArr[i]);
            }
            // "Z"이면
            if ("Z".equals(strArr[i])) {
                // Z이전의 요소를 뺄셈
                answer -= Integer.parseInt(strArr[i-1]);
            }
            
        }
        
        return answer;
    }
}