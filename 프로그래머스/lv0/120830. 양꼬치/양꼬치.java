class Solution {
    public int solution(int n, int k) {
        for(int i = 0; i < (n / 10); i++) { // 양꼬치 양으로 반복문 제어
                                            // - 10개당 음료수 하나이므로 10의 배수일때만
                                            // - 음료수 개수를 하나씩 제외하기 위한 구문
            if (n / 10 != 0) {              // 양꼬치 10인분마다
                k -= 1;                     // 음료수 한개를 서비스로 계산
            }    
        }
        
        int answer = n * 12000 + k * 2000;  // 계산한 양꼬치 양과 음료수 개수를 각각의 금액에 곱함
        return answer;
    }
}