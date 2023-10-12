import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 다른 한 변을 another로 설정하고 변의 길이는 0이하가 될 수 없으므로 1로 설정
        int another = 1;
        // sides를 오름차순으로 정렬
        // - 짧은 변과 긴 변을 설정하기 위함
        Arrays.sort(sides);
        // sides_sum은 another이 가장 긴 변일때를 상정하기위해 설정
        int sides_sum = Arrays.stream(sides).sum();
        
        // another이 sides_sum(두변의 합)보다는 길 수 없으므로 반복문을 해당 범위로 제어
        while(another < sides_sum) {
            // 다른 변이 sides[1]보다는 작거나 같고 sides[1]을 가장 긴변으로 설정하여
            // 두변의 합이 가장 긴 변보다 클때
            if (another <= sides[1] && another + sides[0] > sides[1]) {
                // answer에 1을 증가
                answer++;
            }
            // another가 가장 긴 변이 되려면 sides[1]보다는 길어야 하고
            // 나머지 두변의 합인 sides_sum보다는 작아야하므로
            if (another > sides[1] && another < sides_sum) {
                // 해당 조건을 만족할때 answer을 1증가
                answer++;
            }
            // another은 비교해야할 다른 변의 길이므로 무조건 1씩 증가
            another++;
        }
        return answer;
    }
}