import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // arr의 크기가 1인경우 -1을 반환하기위해 초기 선언을 크기1로 설정
        int[] answer = new int[1];
        // 배열 스트림을 사용하여 최소값을 min정수에 저장
        int min = Arrays.stream(arr)
                    .min()
                    .getAsInt();
        // 만약 arr의 길이가 1이면
        if (arr.length == 1) {
            // 빈배열을 반환하므로 -1을 저장
            answer[0] = -1;
        }
        // arr크기가 2이상이면
        else {
            // stream의 filter를 통해 min과 같은 값을 제외한 요소를 배열로 저장
            answer = Arrays.stream(arr)
                        .filter(element -> element != min)
                        .toArray();
        }
        
        return answer;
    }
}