import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        // 문자열을 배열로 변환
        char[] my = my_string.toCharArray();
        
        // queries의 요소만큼 뒤집어야 하므로 queries의 인덱스를 제어할 반복문 작성
        for(int i = 0; i < queries.length; i++) {
            // 이중 반복문을 돌려줄 범위를 정할 range
            // - 뒤집기 이므로 반복문은 quries의 배열의 요소의 요소 차의 절반만 수행
            int range = queries[i][0] + (queries[i][1] - queries[i][0]) / 2;
            // 만약 두수의 차가 음수이면 반올림해야 하므로
            if ((queries[i][1] - queries[i][0]) % 2 != 0) {
                // range를 1증가
                range++;
            }
            // quries요소의 범위에서 뒤집기 하므로
            // 해당 요소의 끝 수를 idx에 포함
            int idx = queries[i][1];
            // 두 수를 바꾸기 위해 임시로 값을 저장해줄 char자료형의 tmp선언
            char tmp;
            // j를 quries의 i번째 0번인덱스에서 시작하여 range만큼 반복
            for (int j = queries[i][0]; j < range; j++) {
                // tmp에 j번째 요소를 담고
                tmp = my[j];
                // j번째에 idx번째 요소를 담고
                my[j] = my[idx];
                // idx에 tmp를 담아주면 두 수의 뒤집기가 성공
                my[idx] = tmp;
                // idx를 1 감소
                idx--;
            }
        }
        
        answer = new String(my)
            .chars()    // char형태의 값을
            .mapToObj(c -> String.valueOf((char) c))    // mapToObj를 통해 String으로 변환하여
            .collect(Collectors.joining()); // joining함수를 통해 answer에 문자열 형태로 저장
        
        return answer;
    }
}