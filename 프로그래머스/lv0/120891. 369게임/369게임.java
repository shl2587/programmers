class Solution {
    public int solution(int order) {
        int cnt = 0;
    
        while(order != 0) { // order가 0이 아닐때 까지
            if (((order % 10) % 3) == 0 && (order % 10) * 1 != 0) { // order를 10으로 나눈 나머지가 3으로 나누어 0이고 해당 자리수가 0이 아닐때
                cnt++;  // cnt를 1 증가
            }
            order /= 10;    // 다음 수를 비교하기 위해 복합대입연산자를 위해 몫만 남김
        }    
        
        return cnt;
    }
}