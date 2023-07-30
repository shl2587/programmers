class Solution {
    public int solution(String[] order) {
        int answer = 0;
        // 매개변수로 주어진 order 문자열 배열만큼 반복
        for (int i = 0; i < order.length; i++) {
            // americano와 anything이 폼함되어있으면 4500을 answer에 더하고
            if (order[i].contains("americano") || order[i].contains("anything")) {
                answer += 4500;
            }
            // 그렇지 않다면
            else {
                // 5000을 덧셈
                answer += 5000;
            }
        }
        return answer;
    }
}