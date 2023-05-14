import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        ArrayList<Integer> longer = new ArrayList();    // 머쓱이보다 키큰 사람을 담을 ArrayList longer선언
        for (int i = 0; i < array.length; i++) {        // 매개변수 배열의 길이를 반복문 횟수로 제어
            if ( height < array[i]) {                   // 매개변수로 주어진 머쓱이 키보다 크다면
               longer.add(array[i]);                    // longer 리스트에 추가
            }
        }
        return longer.size();       // 해당 리스트의 크기를 구하면 머쓱이보다 키큰 사람의 수가 정해짐
    }
}