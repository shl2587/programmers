import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;  // 일치하는 문자열을 확인하기 위한 정수 count 변수 선언 및 0으로 초기화
        // chArr에 s문자열을 char자료형으로 변환하여 요소 저장
        char[] chArr = s.toCharArray();
        // chArr오름차순 정렬
        Arrays.sort(chArr);
        // chArr의 길이만큼 반복 수행하고 count만큼 인덱스 증가
        // - count만큼 증가시키는 이유는 해당 배열이 비교의 기준점이 될것이기 때문
        for (int i = 0; i < chArr.length; i+=count) {
            // i가 count만큼 증가 하고 나서 count에 0을 저장
            count = 0;
            // 이중 반복문을 지역변수 j를 i부터 시작하게 하여 1씩 증가
            for (int j = i; j < chArr.length; j++) {
                // 만약 chArr[i]와 chArr[j]가 일치한다면
                if (chArr[i] == chArr[j]) {
                    // count가 1 증가
                    count++;
                }
                // 그렇지 않다면 종료
                else {
                    break;
                }
            }
            // count가 1이면 중복 요소가 없다는 뜻이므로
            if (count == 1) {
                // answer에 chArr[i]를 저장
                answer += chArr[i];
            }
        }
        
        
        
        return answer;
    }
}