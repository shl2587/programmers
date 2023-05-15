class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // 대소문자 구분을 하지 않으므로 전부 대문자 아니면 소문자로 통일 시켜줌
        String my = myString.toUpperCase();     // my문자열을 선언하여 초기화
        String pat_upper = pat.toUpperCase();   // pat_upper 문자열을 선언하여 초기화
        if(my.contains(pat_upper)) {    // 문자열 my에 포함되면
            answer = 1; // answer을 1로 저장
        }
        
        return answer;  // 정답반환
    }
}