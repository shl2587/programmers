import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1]; // num2에서 num1을 뺀 값에 1을 더하여 크기를 조절
        
        // copyOfRange 함수를 활용하여 numbers 배열의 num1 인덱스부터 num2+1 인덱스까지만 잘라
        // - answer 배열에 저장
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        
        return answer;
    }
}