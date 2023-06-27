class Solution {
    public String solution(String my) {
        String answer = "";
        char[] capLetter = new char[26];
        char[] smallLetter = new char[26];
        char cap = 'A';
        char small = 'a';
        capLetter[0] = cap;
        smallLetter[0] = small;
        
        // 대문자 배열 만들어줌
        for (int i = 1; i < 26; i++) {
            capLetter[i] = ++cap;
        }
        
        // 소문자 배열 만들어줌
        for (int i = 1; i < 26; i++) {
            smallLetter[i] = ++small;
        }
        
        // 문자열 my의 길이 만큼 반복
        for (int i = 0; i < my.length(); i++) {
            for (int j = 0; j < 26; j++){
                if (my.charAt(i) == capLetter[j]) {
                    // 대문자를 소문자로 바꿔 문자열 변수 answer에 누적 덧셈
                    answer += my.valueOf(my.charAt(i)).toLowerCase();
                    break;
                }
                if (my.charAt(i) == smallLetter[j]) {
                    // 소문자를 대문자로 바꿔 문자열 변수 answer에 누적 덧셈
                    answer += my.valueOf(my.charAt(i)).toUpperCase();
                    break;
                }   
            }
        }
        
        
        return answer;
    }
}