import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // n이 짝수이면
        if ((n % 2) == 0) {
            // 약수 중 소인수인 가장 최소 값인 2를 answer에 저장
            answer.add(2);
            // n이 짝수가 아닐때 까지 복합연산대입자를 통해 나눗셈(몫)
            while((n % 2) == 0) {
                n /= 2;
            }
        }
        
        // 홀수 약수 중 소인수를 찾기 위한 count 정수 변수 선언 및 0으로 초기화
        int count = 0;
        
        // n이 홀수이면
        if ((n % 2) != 0) {
            // 3부터 2씩 증가 시켜 홀수만 나눗셈
            for (int i = 3; i <= n; i+=2) {
                // n을 i로 나누었을때 0이면
                if (n % i == 0) {
                    // 3부터 i를 나누어
                    for (int j = 3; j <= i; j+=2) {
                        // 약수가 발생할 때 마다 count를 1씩 증가
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    // count가 1일때가 소수를 뜻하므로
                    if (count == 1) {
                        // answer에 i를 저장
                        answer.add(i);
                    }
                    // count에 0을 저장
                    count = 0;
                }
            }
        }
        
        return answer;
    }
}