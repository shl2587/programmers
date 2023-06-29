class Solution {
    public String solution(String my) {
        String answer = "";
        
        for (int i = 0; i < my.length(); i++) {
            if (i == 0) {   // 첫번째 무조건 실행하도록 설정
                answer += my.charAt(i);    
            }
            // tmp를 선언과 동시에 지속적으로 i열 문자열로 초기화
            String tmp = String.valueOf(my.charAt(i));
            if(!answer.contains(tmp)) { // tmp에 포함되어 있지 않다면
                answer += my.charAt(i); // answer에 저장
            }
        }
        
        return answer;
    }
}