import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
         StringBuilder alphabet = new StringBuilder();
        // 대문자 부터 소문자까지 전부 추가
        for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
            alphabet.append(alpha);
        }
        for (char alpha = 'a'; alpha <= 'z'; alpha++) {
            alphabet.append(alpha);
        }
        // alphabet 문자열의 인덱스와 answer의 인덱스를 통일시켜 해당 문자열이 존재할때마다 증가
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (my_string.charAt(i) == alphabet.charAt(j)) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}