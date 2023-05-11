class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i : numbers) { // 향상된 for문을 통해 반복회수 제어 및 순차적 인덱스 통제
            answer += i;        // 지역변수 i에 numbers의 요소가 저장되고
                                // answer에 복합대입 연산자를 통해 값을 저장
            if (answer > n) break;  // answer가 n보다 커지면 break
        }
        return answer;
    }
}