class Solution {
    public String solution(String my, String alp) {
        String answer = "";
        String[] strArr = new String[my.length()];  // my문자열을 각각 char자료형으로 변환하여
                                                    // 하나씩 넣어줄 strArr배열 선언
        for (int i = 0; i < my.length(); i++) {     // 반복횟수를 my문자열의 길이만큼 제어
            strArr[i] = String.valueOf(my.charAt(i));   // strArr에 순서대로 삽입
        }
        for (int i = 0; i < my.length(); i++) { // 반복횟수를 my문자열의 길이만큼 제어
            if (String.valueOf(my.charAt(i)).equals(alp)) { // 만약 alp와 해당 문자열이 같다면
                strArr[i] = alp.toUpperCase();  // strArr i번째 요소를 대문자로 바꾸고
            }   
                answer += strArr[i];    // 해당 요소를 빈문자열 answer에 누적 합산
        }

        
        return answer;
    }
}