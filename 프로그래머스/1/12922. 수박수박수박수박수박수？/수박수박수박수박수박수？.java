class Solution {
    public String solution(int n) {
        String answer = "";
        String[] watermelon = {"수", "박"};
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += watermelon[0];
                continue;
            }
            answer += watermelon[1];
        }
        return answer;
    }
}