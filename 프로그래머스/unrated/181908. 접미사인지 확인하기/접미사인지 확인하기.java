import java.util.*;

class Solution {
    public int solution(String my_str, String suffix) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        int answer = 1;
        
        // my_str을 뒤에서부터 list1에 담아주는 작업
        for (int i = my_str.length() - 1; i != -1; i--) {   
            list1.add(my_str.charAt(i));
        }
        
        // suffix를 뒤에서부터 list2에 담아주는 작업
        for (int i = suffix.length() - 1; i != -1; i--) {
            list2.add(suffix.charAt(i));
        }
        
        // 비교대상인 list2가 더 크면 무조건 접미사가 아니므로
        if (list1.size() < list2.size()) {
            answer = 0; // answer에 0을 저장
        }
        else {  // list2의 크기가 더 작은 경우
            for (int i = 0; i < list2.size(); i++) {    // list2의 크기만큼 반복회수를 제어하고
                if (list1.get(i) != list2.get(i)) { // list1과 list2의 요소를 비교하여 일치하지 않으면
                    answer = 0; // answer에 0을 저장하고
                    break;      // 반복문 종료
                }
            }    
        }
        
        
        return answer;
    }
}