class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;    // 각 자리수를 더할 sum 정수 변수 선언
        for (int i = 0; i < number.length(); i++) { // number의 길이만큼 반복회수 제어
            // sum에 number의 i번째 수를 String.valueOf로 String 변환 한 뒤
            // Integer.parseInt로 정수화 시켜줌
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        
        answer = sum % 9;   // answer에 sum % 9을 저장
        return answer;
    }
}