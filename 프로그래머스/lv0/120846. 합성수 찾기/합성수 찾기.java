import java.util.*;

class Solution {
    public int solution(int n) {
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();    // 합성수를 저장할 ArrayList클래스 list객체 생성
        for (int i = 4; i <= n; i++) {  // 3까지는 합성수가 아니므로 4부터 비교 시작
            for (int j = 1; j <= i; j++) {  // j를 i까지 반복 제어
                if (i % j == 0) {   // i에 j를 나눠 나머지가 0이면 약수이므로
                    cnt++;          // cnt에 1증가
                }
                if (cnt >= 3) { // cnt가 3이상일때
                    list.add(i);    // list에 저장
                    cnt = 0;    // cnt에 0을 저장
                    break;
                }
            }
        }
        return list.size();
    }
}