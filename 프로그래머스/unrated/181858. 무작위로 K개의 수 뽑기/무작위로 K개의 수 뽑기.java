import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
                
        // arr의 중복된 수를 제거한 int_stream 배열 생성
        int[] int_stream = Arrays.stream(arr).distinct().toArray();
        // answer에 int_stream을 복사
        answer = Arrays.copyOf(int_stream, k);
        
        // int_stream의 크기가 k보다 작으면 나머지 인덱스의 요소는 0이므로
        if (int_stream.length < k) {
            // 0인 요소를 전부 -1로 저장
            for (int i = int_stream.length; i < k; i++) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}