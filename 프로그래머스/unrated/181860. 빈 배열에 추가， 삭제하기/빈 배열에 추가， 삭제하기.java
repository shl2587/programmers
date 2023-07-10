import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // flag의 크기 만큼 반복을 실행
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {   // flag의 i번째 요소가 true면
                // arr[i]의 두배만큼 반복하고
                for(int j = 0; j < arr[i] * 2; j++) {
                    // asnwer에 arr[i]를 저장
                    answer.add(arr[i]);
                }
            }
            else {  // flag[i]가 false면
                // arr[i] 만큼 반복하고
                for(int k = 0; k < arr[i]; k++) {   
                    // answer의 마지막 인덱스의 요소를 제거
                    answer.remove(answer.size() - 1);    
                }
            }
        }
        
        return answer;
    }
}