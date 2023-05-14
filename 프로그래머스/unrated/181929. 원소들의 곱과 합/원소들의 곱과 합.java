class Solution {
    public int solution(int[] num_list) {
        int multi = 1;  // 누적 곱을 저장할 multi 변수 선언 및 곱의 항등원 1로 초기화
        int sum = 0;    // 합을 더할 sum변수 선언 및 덧셈의 항등원 0으로 초기화
        for (int i = 0; i < num_list.length; i++) { // num_list의 길이로 반복 회수 제어
            multi *= num_list[i];   // multi에 배열의 i번째 요소를 누적 곱
            sum += num_list[i];     // sum에 배열의 i번째 요소를 누적 합
        }
        
        return multi < sum*sum ? 1 : 0; // 누적곱이 합의 제곱보다 작으면 1을 크면 0을 반환
    }
}