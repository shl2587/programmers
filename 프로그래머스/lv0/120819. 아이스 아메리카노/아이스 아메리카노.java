class Solution {
    public int[] solution(int money) {
        int buy, change;    // buy에는 마실 수 있는 잔수를
                            // change에는 잔돈을
        int[] answer = new int[2];  // 위의 두 변수를 담을 배열 answer 선언
        buy = money / 5500;     // 마실 수 있는 수는 몫을
        change = money % 5500;  // 잔돈은 나머지를 나타냄
        answer[0] = buy;        // 0번째 배열에 마실 수 있는 최대 수를
        answer[1] = change;     // 1번째 배열에 잔돈을 저장
        return answer;
    }
}