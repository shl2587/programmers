class Solution {
    public int solution(int a, int b) {
        // 두 수를 연결한 숫자를 result1에 저장하고
        int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        // 두 수를 곱한 수에 2를 곱한 결과를 result2에 저장
        int result2 = a * b * 2;
        
        // 삼항연산자를 통해 더 큰 수를 출력
        return result1 > result2 ? result1 : result2;
    }
}