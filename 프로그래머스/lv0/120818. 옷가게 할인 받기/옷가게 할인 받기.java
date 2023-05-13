class Solution {
    public int solution(int price) {
        int answer = price; // 금액을 answer변수에 초기화
        if (price >= 100000){   // 금액이  10만원 이상일 때
            if (price >= 500000) {  // 금액이 50만원 넘어가면
                answer = (int)(price * 0.8);    // 20프로 할인 금액을
            }
            else if (price >= 300000 && price <500000) {    // 30이상 50 미만일때
                answer = (int)(price * 0.9);    // 10프로 할인 금액
            }
            else {  // 10만원이상 30만원 미만이면
                answer = (int)(price * 0.95); // 5프로 할인금액  
            }    
        }
        return answer;
    }
}