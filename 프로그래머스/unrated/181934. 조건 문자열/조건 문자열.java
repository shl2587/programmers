class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean flag;
        // ineq가 "<"이면
        if ("<".equals(ineq)) {
            // flag에 <로 비교한 값 저장
            flag = n < m;
            // eq가 "="이면
            if ("=".equals(eq)) {
                // flag에 <=로 다시 저장
                flag = n <= m;
            }
        }
        // ineq가 ">"이면
        else {
            // flag에 >로 비교한 값 저장
            flag = n > m;
            // eq가 "="이면
            if ("=".equals(eq)) {
                // flag에 >=로 다시 저장
                flag = n >= m;
            }
        }
        
        // 조건에 맞다면 answer에 1을 저장
        if (flag) {
            answer = 1;
        }
        return answer;
    }
}