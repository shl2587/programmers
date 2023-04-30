class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        // 곱하기는 결국 더하기의 반복횟수임을 이용하여
        for (int i = 0; i < k; i++) {   // 곱할수로 반복 회수를 제어하고
            answer += my_string;        // 덧셈 복합대입연산자로 해당 횟수만큼 더해줌
        }
        return answer;
    }
}