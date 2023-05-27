import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();    // strArr요소의 길이를 저장할 list선언
		ArrayList<Integer> list2 = new ArrayList<>();   // 같은 길이 요소의 개수를 저장할 list2 선언
		int cnt = 1;        // 같은 길이 요소를 세어줄 cnt를 선언 및
                            // 1로 초기화 - 0으로 초기화하면 같을 경우 개수를 세어주는게 아니라
                            // 똑같은 경우의 수를 세어주기 때문
        
        for (int i = 0; i < strArr.length; i++) {   // strArr의 크기 만큼 반복 회수 제어
            list.add(strArr[i].length());   // list에 staArr i번째 요소의 길이만큼 저장
        }
        
        list.sort(null);    // 같은 길이를 세어주기 위한 오름차순 정리
        
        for (int i = 0; i < list.size(); i++) { // list의 크기만큼 반복회수 제어
            if (i == list.size() - 1) break;    // i번째 배열의 + 1 과 비교할 예정이어서
                                                // outofbound 에러를 피하기위해 해당 break조건 설정
        	if (list.get(i) == list.get(i + 1)) {   // i번째 요소와 다음요소가 같으면
        		cnt++;              // cnt에 1을 증가
                list2.add(cnt);     // list2에 계속하여 저장
        	}   
        	else {  // 같지않다면
        		cnt = 1;    // cnt에 1을 저장하여 값을 재지정
        	}
            
        }
        
        Collections.sort(list2, Collections.reverseOrder());    // 내림차순 정리하여
        answer = list2.get(0);  // 가장 큰 수를 불러옴
        
        return answer;
    }
}