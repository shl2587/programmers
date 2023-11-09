import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // arr배열을 int_list 리스트로 변환
        List<Integer> int_list = Arrays.stream(arr)
                                    .boxed()
                                    .collect(Collectors.toList());

        for (int i = 0; i < query.length; i++) {
            int size = int_list.size();
            if (i % 2 != 0) {
                int_list.subList(0, query[i]).clear();
            }
            if (i % 2 == 0) {
                int_list.subList(query[i] + 1, size).clear();
            }
        }
        
        int[] answer = int_list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}