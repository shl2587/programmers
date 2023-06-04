import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {  // 정수의 약수는 1부터 시작하므로
                                        // 지역변수 i를 1로 초기화하고 1씩증가
            if (n % i == 0) {           // n을 i로 나누어 0으로 나누어 떨어지면
                list.add(i);            // list에 추가
            }
        }
        return list;
    }
}