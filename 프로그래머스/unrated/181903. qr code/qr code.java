class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        // code문자열 만큼 반복
        for (int i = 0; i < code.length(); i++) {
            // index에 i를 q로 나눈 나머지 를 저장
            int index = i % q;
            if (index == r) {
                // answer에 code의 문자열을 덧셈
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}