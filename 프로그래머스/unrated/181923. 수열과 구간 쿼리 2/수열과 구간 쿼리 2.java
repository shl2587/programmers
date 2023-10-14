import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries의 1차원 배열의 길이를 answer의 크기로 설정
        int[] answer = new int[queries.length];
        // answer의 인덱스를 통제할 idx
        int idx = 0;
        
        // queries의 길이만큼 반복 실행
        for (int i = 0; i < queries.length; i++) {
            // s는 시작 인덱스, e는 종료 인덱스, k는 비교 정수
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            // tmp배열에 s부터 e까지를 복사하고
            int[] tmp = Arrays.copyOfRange(arr, s, e+1);
            // tmp를 오름차순 정렬
            Arrays.sort(tmp);
            
            // tmp를 반복문을 통해 요소 비교
            for (int j = 0; j < tmp.length; j++) {
                // answer의 idx에 기본값 -1을 삽입
                answer[idx] = -1;
                // k보다 큰 수가 있으면 
                if (tmp[j] > k) {
                    // answer[idx]에 저장하고
                    answer[idx] = tmp[j];
                    // 반복문 종료
                    // - 오름차순으로 정렬하였기 때문에 가능
                    break;
                }
            }
            // 내부 반복문이 종료되면 idx 1증가
            idx++;
        }
        return answer;
    }
}