import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int n1, n2, n3;         // 3변의 길이를 담기 위한 변수 선언
        Arrays.sort(sides);     // sides배열 정렬
        n1 = sides[0];          // 요소가 3개이므로 반복문을 사용하지 않고
        n2 = sides[1];          // 실행 타임 제어를 위해 수동으로 요소 변수에 저장
        n3 = sides[2];          
        if ((n1 + n2) > n3) {   // 정렬로 인해 n3에 가장 큰값이 담기므로
                                // 나머지 두 정수의 합과 비교하여
                                // 두 정수의 합이 크면
            return 1;           // 1을 리턴
        }
        
        return 2;               // 아니면 2를 리턴
    }
}