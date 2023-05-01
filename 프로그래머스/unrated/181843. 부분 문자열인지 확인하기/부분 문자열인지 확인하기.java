class Solution {
    public int solution(String my, String target) {
        int j = 0;      // target의 인덱스를 제어할 정수 j 선언 및 0으로 초기화
                        // - 이중 반복으로는 제어가 힘들고 런타임이 초과할 수 있기 때문
        int answer = 0;   // 부분 문자열이 아닌 것을 기본값으로 초기화
        for (int i = 0; i < my.length(); i++) { // for 반복문을 비교할 문자열 길이로 제어
            if(my.charAt(i) == (target.charAt(j))){ // my문자열의 i번째와 target의 0번째가 같으면
                j++;                                // j에 1을 더함
            }
            if (j == target.length()) {     // j와 target의 크기가 같다면
                answer = 1;                 // 연속됨을 의미하므로 answer에 1을 저장하고
                break;                      // 반복문 종료
            }
        }
        return answer;
    }    
        
}