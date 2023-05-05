class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];  // 개수를 저장할 answer 배열 선언
        int count = 0;              // 짝수의 개수를 저장할 count변수 선언
        
        for (int i = 0; i < num_list.length; i++) { // 배열의 길이로 반복문 제어
            if (num_list[i] % 2 == 0) { // 만약 요소에 2를 나누어떨어지면
                ++count;                // count를 증가시켜주고
            }
        }
        
        answer[0] = count;      // answer배열에 count저장(짝수 개수)
        answer[1] = (num_list.length - count); // 매개변수 배열의 길이에서 count를 빼면 홀수의 개수
        return answer;
    }
}