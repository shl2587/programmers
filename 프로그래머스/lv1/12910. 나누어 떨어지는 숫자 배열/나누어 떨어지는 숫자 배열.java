import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 비교하는 배열을 미리 오름차순 정렬
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // 해당 요소가 divisor로 나누어 떨어지면
            if(arr[i] % divisor == 0) {
                // answer에 해당 요소를 추가
                answer.add(arr[i]);    
            }
        }
        // 해당 반복문에서 추가된 요소가 없다면
        if(answer.size() == 0) {
            // 리스트에 -1을 추가
            answer.add(-1);
        }
        return answer;
    }
}