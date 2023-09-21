import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();    
        while(n >= k) {   // k가 n보다 크면 안된다는 제어문을 통해 반복문 제어
            list.add(k);    // k를 삽입
            k += list.get(0);   // k에 복합대입연산자를 통해 최초값을 더해주면 공배수와 같음
        }
        return list;    
    }
}