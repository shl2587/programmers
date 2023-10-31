import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        // score 이차원 배열의 각 요소의 평균을 구하는 반복문
        for (int i = 0; i < score.length; i++) {
            double tmp = (double)Arrays.stream(score[i])
                .average()
                .orElse(0); // 평균값이 없으면 0을 삽입하여 예외상황 처리
            avg[i] = tmp;
        }
        
        // 순위 비교를 위해 정렬할 copied_avg 중복제거하여 복사
        double[] copied_avg = Arrays.stream(avg)
            .distinct()
            .toArray();
        // copied_avg 오름차순 정렬
        // - 내림차순 정렬은 Integer과 같이 primitive 자료형으로만 가능하기 때문
        Arrays.sort(copied_avg);
        
        // copied_avg 인덱스를 통제할 idx 선언 및 마지막 인덱스로 초기화
        // - 마지막 인덱스 초기화 이유는 오름차순 정렬하여 마지막 요소가 1등이기 때문
        int idx = copied_avg.length - 1;
        // 순위를 매겨줄 rank 선언 및 1로 초기화
        int rank = 1;
        
        // idx로 while문 통제하여 인덱스를 벗어나는 예외상황까지 고려
        while (idx != -1) {
            // count의 역할은 중복되는 순위 확인 및 rank를 정하기 위함
            int count = 0;
            for (int i = 0; i < avg.length; i++) {
                // count가 0이고 copied_avg[idx]와 avg의 수가 같다면
                // - count가 0이라는 의미는 최초의 비교라는 뜻
                if(count == 0 && copied_avg[idx] == avg[i]) {
                    // 해당 i번째 인덱스의 answer에 순위 표기
                    answer[i] = rank;
                    // count를 1증가하고
                    count++;
                    // continue를 통해 다음 순서로 진행
                    // - continue를 적어주지 않으면 다음 if문이 무조건 실행되기 때문
                    continue;
                }
                // count가 0이 아니고 copied_avg[idx]와 avg의 수가 같다면
                if(count != 0 && copied_avg[idx] == avg[i]) {
                    // 해당 i번째 인덱스의 answer에 앞선 avg요소와 같은 순위 표기
                    answer[i] = rank;
                    // 순위를 건너띄우기 위한 count 1증가
                    count++;
                }
            }
            // 비교할 copied_avg의 인덱스는 1 감소시키고
            idx--;
            // rank에는 count를 더해줌
            rank+=count;
        }
        
        
        
        return answer;
    }
}