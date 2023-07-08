class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // 문자열 strK에 k를 문자열로 변환하여 저장
        String strK = String.valueOf(k);
        for (int num = i; num <= j; num++) { // i부터 k까지 반복
            String tmp = String.valueOf(num);   // 문자열로 변환하여 tmp 문자열 변수에 저장
            // 0부터 tmp길이 -1만큼 반복하는 이중for문 작성
            for (int idx = 0; idx < tmp.length(); idx++) {
                // 만약 tmp의 idx번째 문자열이 strK와 일치하면
                if (String.valueOf(tmp.charAt(idx)).equals(strK)) {
                    // answer을 1증가
                    answer++;
                }
            }
        }
        return answer;
    }
}