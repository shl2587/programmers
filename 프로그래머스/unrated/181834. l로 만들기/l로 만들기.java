class Solution {
    public String solution(String myString) {
        String answer = "";
        char ch = 'l';  // ch선언 및 'l'로 초기화
        for (int i = 0; i < myString.length(); i++) {   // myString의 길이만큼 반복회수 제어
            if (myString.charAt(i) < ch) {  // ch의 아스키코드 값보다 작다면
              myString = myString.replace(myString.charAt(i), ch);  // 해당 문자열을 ch로 변환하여 myString에 저장
            }
        }
        answer = myString;  // answer에 모두 변환된 myString을 저장
        
        return answer;
    }
}