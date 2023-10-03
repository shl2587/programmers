import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        // 마지막 요소와 비교해서 요소가 제거되므로 Stack사용
        Stack<Integer> stk = new Stack<>();
        
        // arr_idx를 통해 arr인덱스 통제
        int arr_idx = 0;
        // while문을 통해서 arr배열크기만큼 반복
        while(arr_idx < arr.length) {
            // stk가 비어있지 않으면
            if (!stk.empty()) {
                // stk의 마지막 요소와 arr의 요소를 비교하여 크거나 같으면
                if(stk.peek() >= arr[arr_idx]) {
                    // stk를 제거
                    stk.pop();
                }
                // stk가 arr의 요소가 작으면
                else {
                    // stk에 arr의 요소를 삽입
                    stk.push(arr[arr_idx]);
                    // arr인덱스 증가
                    arr_idx++;
                }
            }
            // stk가 비어있으면
            else {
                // stk에 삽입
                stk.push(arr[arr_idx]);
                // arr요소 증가
                arr_idx++;
            }
        }
        
        return stk;
    }
}