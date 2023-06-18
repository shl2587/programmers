import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int num;
        answer.add(n);  // 최초값을 저장
        while (n / 2 != 0) {    // n을 2로 나누어 몫이 0이 아닐때 까지 반복
            if (n % 2 == 0) {   // n이 짝수이면
                n /= 2;         // n을 복합대입 연산자로 2로나누어 저장
                answer.add(n);  // answer에 n을 추가
            }
            else {  // 짝수가 아니면
                n = 3 * n + 1;  // n에 3을 곱하고 1을 더한뒤 n에 저장
                answer.add(n);  // n을 answer에 추가
            }
        }
        
        return answer;
    }
}