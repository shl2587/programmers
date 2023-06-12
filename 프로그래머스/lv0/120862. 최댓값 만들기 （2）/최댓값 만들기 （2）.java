import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);   // numbers[i]의 요소를 전부 list에 추가하여
        }
        
        list.sort(null);    // 오름차순 정렬하고
        // 음수 값을 고려하여
        int minMulti = list.get(0) * list.get(1);   // 앞의 두 수의 곱과
        // 끝의 두 수를 곱하여
        int maxMulti = list.get(numbers.length-2) * list.get(numbers.length-1);
        // 값을 비교하고 더 큰 값을 answer에 저장
        answer = minMulti > maxMulti ? minMulti : maxMulti;
        
        return answer;
    }
}