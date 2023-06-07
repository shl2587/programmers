import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();    // 정답을 담아줄 ArrayList<Integer> list 선언
        int result = 1; // 중복되는지 판별해줄 result정수 변수 선언 및 1로 초기화
        for (int i = 0; i < arr.length; i++) {  // arr i번째 인덱스 요소와
            for (int j = 0; j < delete_list.length; j++) {  // delete_list j번째 요소를 비교하기 위한
                                                            // 반복횟수 제어
                if (arr[i] == delete_list[j]) { // arr[i] == delete_list[j]이면
                    result = 0; // result에 0을 저장하고
                    break;      // 반복문 종료
                }
                else {  // 요소가 같지 않다면
                    result = 1; // result에 1을 저장
                }
            }
            if (result == 1) {  // result가 1이면
                list.add(arr[i]);   // list에 저장
            }
        }
        
        return list;
    }
}