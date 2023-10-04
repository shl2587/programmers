import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        // arr의 인덱스를 통제할 arr_idx를 0으로 선언
        int arr_idx = 0;
        // arr_idx가 arr의 길이보다 작을때 까지 반복
        while(arr_idx < arr.length) {
            // stk의 크기가 0이 아니고 stk의 마지막 요소가 arr의 요소와 같은면
            if (stk.size() != 0 && stk.peek() == arr[arr_idx]) {
                // 제거
                stk.pop();
            }
            // stk의 크기가 0이거나 stk의 마지막 요소와 arr의 요소와 다르면
            else if (stk.size() == 0 || stk.peek() != arr[arr_idx]) {
                // stk에 추가
                stk.push(arr[arr_idx]);
            }
            // arr의 인덱스는 모든 조건에서 증가하므로 조건문에서 제외
            arr_idx++;
        }
        // 위의 반복문이 실행되어 stk에 아무런 요소가 없으면 -1을 추가하여 반환
        if (stk.size() == 0) {
            stk.push(-1);
        }
        
        return stk;
    }
}