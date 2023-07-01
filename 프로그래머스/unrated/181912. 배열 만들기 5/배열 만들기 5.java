import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        String str; // intStrs의 문자열 요소들을 자른 문자열을 저장할 str문자열 변수 선언
        int num;    // 자른 문자열을 정수로 변환하여 저장할 num정수 변수 선언
        
        //  intStrs의 길이만큼 반복 실행
        for (int i = 0; i < intStrs.length; i++) {
            str = intStrs[i].substring(s, (s+l));   // str에 잘라낸 문자열 정수 저장
            num = Integer.parseInt(str);    // num에 정수로 변환시킨 str문자열 저장
            if (num > k) {  // k보다 num이 크면
                answer.add(num);    // answer에 num을 저장
            }
        }
        return answer;
    }
}