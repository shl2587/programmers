class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {     // 해당 배열의 전체 길이를 범위로 제어하고
            if(num_list[i] == n) {                      // num_list배열의 요소와 비교할 정수 변수가 같으면
                answer = 1;                             // 반환할 변수에 1일 저장하고
                break;                                  // 반복문을 종료
            }
        }
        return answer;                                  // 저장된 값을 반환
    }
}