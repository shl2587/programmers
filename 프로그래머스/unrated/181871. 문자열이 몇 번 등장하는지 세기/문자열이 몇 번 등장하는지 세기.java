class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        // myString의 길이만큼 반복
        for(int i = 0; i < myString.length(); i++) {
            // pat의 길이에 i만큼 더하여 반복을 진행하여 index관리
            // 지역 변수 j를 i로 설정하는 이유는 시작하는 문자열이 1개씩 밀리기 때문
            for (int j = i; j < pat.length() + i; j++) {
                // 인덱스가 초과하는 것을 방지하는 구문
                if (pat.length() + i > myString.length()) break;
                // str에 myString의 j번째 문자열들을 덧셈하여 저장
                str += myString.charAt(j);
            }
            // pat과 str이 같으면
            if (pat.equals(str)) {
                // answer을 1증가
                answer++;
            }
            // 다음 문자열을 저장해주기위해 str에 ""빈문자열 저장
            str = "";
        }
        return answer;
    }
}