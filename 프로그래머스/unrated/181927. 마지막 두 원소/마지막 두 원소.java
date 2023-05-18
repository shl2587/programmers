import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];    // 요소 하나를 추가하여 정답을 담아줄 answer배열 선언
        int index = 0;  // answer의 인덱스를 통제할 index정수 변수 선언
        for (int i : num_list) {    // 향상된 for문을 통해
            answer[index] = i;  // 지역변수에 저장된 num_list의 요소를 넣어주고
            index++;    // answer의 index를 제어
        }   
        int[] tmp = new int[num_list.length];   // 임시 배열을 만들어
        tmp = num_list; // 매개변수를 삽입
        
        int end_index = num_list.length - 1;    // 제일 끝의 인덱스인 end_index를 선언 및
                                                // num_list의 크기에서 -1한 값으로 초기화
        int end_minus = end_index - 1;          // end_index 앞의 인덱스인 end_minus를 선언 및 초기화
        
        int end = tmp[end_index];           // 마지막 배열 요소인 end에 요소 삽입
        int end_front = tmp[end_minus];    // 마지막 배열 앞 요소인 end_front에 요소 삽입
        
        // 삼항 연산자를 통해 answer배열의 마지막 배열에 요소 삽입
        answer[num_list.length] = end > end_front ? end - end_front : end * 2;
        
        return answer;
    }
}