import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        if (n == 1) {
            answer = 1;
        }
        else {
            String str = String.valueOf(n); // 문자열 변수 str에 String.valueOf로 n을 저장
            int size = str.length();        // arr배열의 크기를 정해주기 위한 문자열 size에
                                            // str의 크기를 저장
            char[] chArr = new char[size];  // char 자료형의 chArr배열 선언
                                            // 오름차순 정렬을 위함
            for (int i = 0; i < chArr.length; i++) {
                chArr[i] = str.charAt(i);   // chArr배열에 str의 문자열을 순서대로 삽입
            }
            // 해당 배열을 오름차순 정렬
            Arrays.sort(chArr);
            // str에 빈문자열을 저장하여
            str = "";
            // chArr의 요소를 내림차순으로 덧셈
            for (int i = size - 1; i != -1; i--) {
                str += chArr[i];
            }
            // answer에 parseInt하여 문자열을 정수로 변환
            answer = Long.parseLong(str);
        }
        
        return answer;
    }
}