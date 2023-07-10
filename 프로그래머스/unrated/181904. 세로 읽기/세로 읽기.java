class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        // m번째 마다 줄을 바꿔 각 줄의 c번째 문자열을 더해주어야 하므로
        // 지역변수 i를 c로 설정하여 m만큼 더해주면 해당 조건 구현 가능
        for(int i = c; i <= my_string.length(); i+=m) {
            // 해당 i범위의 substring을 실행하여 answer에 저장
            answer += my_string.substring(i-1,i);
        }
        return answer;
    }
}