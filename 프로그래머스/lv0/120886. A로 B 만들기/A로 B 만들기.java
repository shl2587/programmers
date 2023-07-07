import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int len = before.length();
        char[] chArrBe = new char[len]; // before의 문자열을 char자료형으로 저장할 chArrBe배열 선언
        char[] chArrAf = new char[len]; // after의 문자열을 char자료형으로 저장할 chArrAf배열 선언
        // len만큼 반복
        for(int i = 0; i < len; i++) {    
            // before과 after의 문자열을 배열에 저장
            chArrBe[i] = before.charAt(i);
            chArrAf[i] = after.charAt(i);
        }
        // 배열을 오름차순 정렬
        Arrays.sort(chArrBe);
        Arrays.sort(chArrAf);
        // len만큼 반복하여
        for(int i = 0; i < len; i++) {    
            // 두 배열의 요소가 일치하면
            if(chArrBe[i] == chArrAf[i]) {
                answer = 1; // answer에 1을 저장
            }
            else {  // 일치하지 않으면
                answer = 0; // 0을 저장하고
                break;  // 반복문 종료
            }
        }
        return answer;
    }
}