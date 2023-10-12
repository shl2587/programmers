import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        // 팩토리얼 특성상 long과 int의 표현 범위를 넘을 수 있기 때문에
        // - 큰 정수를 표현할 수 있는 BigInteger 사용
        BigInteger big_int1 = null;
        BigInteger big_int2 = null;
        BigInteger ball_count = new BigInteger("1");
        
        // 분자를 정하는 팩토리얼 결과
        for (int i = balls; i != 0; i--) {
            ball_count = ball_count.multiply(BigInteger.valueOf(i));
        }

        // 분모를 결정하는 팩토리얼 결과
        big_int1 = new BigInteger("1");
        big_int2 = new BigInteger("1");
        for (int i = (balls - share); i != 0; i--) {
            big_int1 = big_int1.multiply(BigInteger.valueOf(i));
        }
        for (int i = share; i != 0; i--) {
            big_int2 = big_int2.multiply(BigInteger.valueOf(i));
        }
        
        // big_int1을 분모로 저장
        big_int1 = big_int1.multiply(big_int2);
        
        // 분모를 분자로 나눔
        ball_count = ball_count.divide(big_int1);
        
        // 분자에서 분모를 나눈 몫을 answer에 저장
        answer = ball_count.intValue();
        
        return answer;
    }
}