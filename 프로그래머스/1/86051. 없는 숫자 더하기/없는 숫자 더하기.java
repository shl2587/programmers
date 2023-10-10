class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // answer에 0부터 9까지를 더함
        for (int i = 0; i < 10; i++) {
            answer += i;
        }
        // answer에서 numbers요소를 전부 뺄셈
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}