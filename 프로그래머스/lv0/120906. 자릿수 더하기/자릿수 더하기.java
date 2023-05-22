class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        String sNum = String.valueOf(n);   // 반복 회수 제어를 위해 해당 정수를 문자열로 치환해줄
                                            // sNum 문자열 선언 및 해당 정수 치환하여 초기화
        for (int i = 0; i < sNum.length(); i++) {   // sNum의 길이만큼 반복회수 제어
            answer += (num % 10);   // 정답을 반환할 변수에 나머지를 누적합산
            num /= 10;  // 10으로 나누어 더해진 값을 제거
        }
        return answer;
    }
}