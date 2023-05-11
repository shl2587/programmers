import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];  // 5개의 오름차순 배열요소를 담을 answer배열 변수 선언
        int index = num_list.length - 1;    // num_list의 인덱스 통제를 위한 정수 변수 index 선언
                                            // - 인덱스의 마지막 수는 배열의 크기보다 1작음을 주의
        Arrays.sort(num_list);              // num_list오름차순 정렬
        
        for (int i = num_list.length - 6; i != -1; i--) {     // i를 통해 반복 횟수 및 
                                                        // answer배열의 인덱스 통제를 위한 제어문 작성
            answer[i] = num_list[index];    // answer의 뒤의 인덱스 부터 요소 삽입
                                            // 요소 저장과 동시에 오름차순 정렬을 해주기 위함
            index--;                        // num_list의 인덱스 감소
        }
        
        return answer;
    }
}