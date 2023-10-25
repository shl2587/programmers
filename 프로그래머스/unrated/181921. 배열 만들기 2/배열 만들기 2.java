import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 반복문을 5의 배수부터 5씩 증가하기 위해 l을 5의 배수로 만들어주는 과정
        int start = l % 5;
        // 만약 start가 0이 아니라면 l이 5의 배수가 아니므로  l에 5에서 l에 5로 나눈 나머지를 뺀값을 더해 5의 배수로 만들어줌
        if (start != 0) {
            l += 5 - l % 5;
        }
        
        // 5씩 증가하는 반복문
        for (int i = l; i <= r; i+=5) {
            // tmp에 i를 문자열 형태로 저장
            String tmp = String.valueOf(i);            
            // 만약 tmp에 5가포함되어 있다면
            // - 5가 포함 되어 있지 않는 수는 0이 포함되어 있더라도 조건 만족하지 못하기 때문
            if (tmp.contains("5")) {
                // flag를 통해 5 또는 0으로 이루어져있는지 확인
                boolean flag = false;
                // String 길이만큼 반복하여
                for (int j = 0; j < tmp.length(); j++) {
                    // 5 또는 0이 포함되면 flag에 true를 저장
                    if (tmp.charAt(j) == '5' || tmp.charAt(j) == '0') {
                        flag = true;
                    }
                    // 그렇지 않은 문자열이 하나라도 있다면 false를 저장하고 반복문 종료
                    else {
                        flag = false;
                        break;
                    }
                }
                // flag가 true이면 i를 추가
                if (flag) {
                    answer.add(i);
                }
            }
        }
        // answer의 크기가 0이라면 만족한 수가 없다는 뜻이므로
        if (answer.size() == 0) {
            // -1을 저장
            answer.add(-1);
        }
        
        return answer;
    }
}