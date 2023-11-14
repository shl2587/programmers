class Solution {
    public String solution(String code) {
        String answer = "";
        // mode 변경의 기준이 될 int_code 선언 및 0으로 초기화
        char int_code = '0';
        for (int i = 0; i < code.length(); i++) {
            // code의 문자열 중 1을 마주쳤을때
            if (code.charAt(i) == '1') {
                // int_code가 1이면 0으로 변환하고 0이면 1로 변환
                if (int_code == '1') {
                    int_code = '0';
                    continue;
                }
                if (int_code == '0') {
                    int_code = '1';
                    continue;
                }
            }
            // 처리된 int_code를 바탕으로 answer에 더해줄 문자열 인덱스 결정
            if (int_code == '0' && i % 2 == 0) {
                answer += code.charAt(i);
            }
            if (int_code == '1' && i % 2 != 0) {
                answer += code.charAt(i);
            }
        }
        if ("".equals(answer)) answer = "EMPTY";
        return answer;
    }
}