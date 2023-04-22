class Solution {
    public int solution(int num1, int num2) {
        double answer = num1 / (double)num2 * 1000; // 나눗셈을 진행할때 소수점 아래 수를 구하려면 실수로 계산해야함
                                                    // 실수로 나눠주기위한 형변환
        return (int)answer;                         // 정수부분만 반환하기 위한 형변환
    }
}
