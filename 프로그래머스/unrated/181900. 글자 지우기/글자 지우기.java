import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
		int index = 0;
		Arrays.sort(indices);
	    // indices의 길이만큼 반복
	    for (int i = 0; i < my_string.length(); i++) {
	        // idx에 indices의 i번째 요소를 저장
	        int idx  = indices[index];
	        if (i != idx) { // i와 idx가 같지 않다면
                // answer에 my_string의 i번째 문자열을 덧셈
	            answer += my_string.charAt(i);
	        }
            // index가 indices의 길이보다 1 작을때 까지
            // - 길이의 -1을 해주는 이유는 최종값이 길이보다 1이 작아야 하기 때문
            // - 해당 범위가 아니라면 길이보다 1작은 값에 1이 더해저 해당 길이만큼의 값을 가지게됨
	        else if (index < indices.length - 1) {
                // index에 1증가
	            index++;
	        }
	        
	    }
        
        return answer;
    }
}