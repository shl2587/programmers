import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열을 정렬해줌
        // 오름차순 정렬된 마지막 요소와 마지막 앞 요소를 곱하여 최댓값을 answer변수에 저장
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2]; 
        return answer;
    }
}