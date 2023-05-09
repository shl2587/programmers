class Solution {
    public int solution(int[] dot) {
        int x, y;
        x = dot[0]; // dot 배열의 0번째 인덱스의 값은 x축
        y = dot[1]; // dot 배열의 1번째 인덱스의 값은 y축
        
        if (x > 0 && y > 0 ) {  // 두 수가 모두 양수이면
            return 1;           // 1을 반환
        }   
        else if (x < 0 && y > 0 ) { // x가 0보다 작고 y가 0보다 크면
            return 2;               // 2를 반환
        }
        else if (x < 0 && y < 0 ) { // x, y 모두 음수면
            return 3;               // 3을 반환
        }
        else {          // x가 음수고 y가 양수일때
            return 4;   // 4를 반환
        }
    }
}