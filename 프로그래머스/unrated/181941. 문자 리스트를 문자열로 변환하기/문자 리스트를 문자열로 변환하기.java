class Solution {
    public String solution(String[] arr) {
        String answer = ""; // 정답을 반환할 문자열 answer 선언 및 빈문자열로 초기화
        for(int i = 0; i < arr.length; i++) {   // 문자열이 담긴 배열의 길이만큼 인덱스 제어
            answer += arr[i];       // 문자열은 더하기가 가능하므로
                                    // - 덧셈 복합대입연산자를 통해 합친 문자열 저장
        }
        return answer;
    }
}