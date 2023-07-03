class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int idx = 0; // included의 인덱스를 제어할 정수 변수 idx를 선언하고 0으로 초기화
        int len = a+d*included.length; // 반복 범위 정함
        System.out.println(len);
        // a만큼 증가하는 지역변수 i를 선언하고 len까지 반복
        for (int i = a; i < len; i+=d) {
            if (included[idx] == true) {    // included의 요소가 true면
                answer += i;    // answer에 i를 누적 덧셈
            }
            idx++;  // included의 인덱스 증가
        }
        return answer;
    }
}