class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = ""; // 치환한 문자열을 담을 result 문자열 변수 선언 및 빈문자열로 초기화
        for (int i = 0; i < myString.length(); i++) {   // myString의 길이만큼 반복문 제어
            char tmp = myString.charAt(i);  // myString문자열의 각 자리수를 비교하기 위해
                                            // char형태로 치환하기 위한 char 자료형의 tmp 선언 및 초기화
            if (String.valueOf(tmp).equals("A")) {  // 해당 자리수의 문자열이 "A"이면
                result += "B";  // result변수에 "B"를
            }
            else {  // "A"가 아니면(A 아니면 B이기 때문에 상세 조건을 적어줄 필요 없음)
                result += "A";  // "A"를 복합대입 연산자를 통해 누적 합
            }
        }
        if (result.contains(pat)) { // 치환된 문자열에 pat이 포함되어 있으면
            answer = 1; // answer에 1을 저장
        }
        
        return answer;
    }
}