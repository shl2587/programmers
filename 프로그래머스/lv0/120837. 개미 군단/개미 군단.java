class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += (hp / 5);
        hp %= 5;
        if ((hp %= 5) != 0) {
            answer += (hp / 3);
            hp %= 3;
        }
        answer += (hp / 1);
        return answer;
    }
}