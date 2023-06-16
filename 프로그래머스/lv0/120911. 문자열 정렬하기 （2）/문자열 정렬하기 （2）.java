import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = my_string.toLowerCase();   // 소문자로 변환
        char[] arr = new char[my_string.length()];  // 매개변수의 문자열 크기의 arr선언
        for (int i = 0; i < arr.length; i++) {  // arr의 크기만큼 반복 제어
            arr[i] = str.charAt(i); // arr의 배열에 str의 각 문자열을 저장
        }
        Arrays.sort(arr);   // 배열 오름차순 정렬
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];   // answer에 arr의 요소들을 누적 덧셈하여 저장
        }
        return answer;
    }
}