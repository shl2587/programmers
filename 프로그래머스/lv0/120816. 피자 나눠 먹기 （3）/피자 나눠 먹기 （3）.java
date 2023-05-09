class Solution {
    public int solution(int slice, int n) {
        int answer = n / slice; // 최소 한조각이면 사람수를 조각으로 나누었을때 몫이 1이어야함
        if (n % slice != 0) {   // 나머지가 0이 아닐때
            return answer + 1;  // 몫에 1을 더해줘야 모두에게 한조각씩 돌아가게됨
                                // - 해당값을 반환
        }
        return answer;
    }
}