import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5]; // 크기가 5인 정수 배열 선언
        Arrays.sort(num_list);  // num_list를 오름차순 정렬
        
        
        
        for (int i = 0; i < answer.length; i++) {   // answer배열의 크기만큼 회수 제어
            answer[i] = num_list[i];    // answer에 num_list 오름차순으로 삽입
        }
        return answer;
    }
}