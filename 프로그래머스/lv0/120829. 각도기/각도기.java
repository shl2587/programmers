class Solution {
    public int solution(int angle) {
            // else if 는 이전의 if문에 충족되는 조건을 제외하는 동시에
            // 현재 조건을 적용
            if (angle < 90) {           // 직각보다 작을때 
                return 1;               // 1을 반환
            }
            else if (angle == 90) {     // 직각일때
                return 2;               // 2를 반환
            }
            else if (angle < 180) {     // 180도 미만이고 90보다 클때
                return 3;               // 3을 반환
            }
            else return 4;              // 평각일때 4를 반환
       
    }
}