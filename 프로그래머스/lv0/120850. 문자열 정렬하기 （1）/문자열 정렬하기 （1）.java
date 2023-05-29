import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        char cNum;  // my_string의 문자열에서 숫자만 비교하기 위한 cNum char변수 선언
		int num;    // 숫자를 저장하기 위한 정수 num 변수 선언
		
		for (int i = 0; i < my_string.length(); i++) {  // my_string
			cNum = '0'; // char자료형 0으로 초기화
			for (int j = 0; j < 10; j++) {  // 0에서 9까지 cNum에 저장
				if (my_string.charAt(i) == cNum) {  // my_string의 i번째 문자열이 cNum과 같다면
                    // num 정수 배열에 my_string의 i번째 문자열을 정수로 변환
					num = Integer.parseInt(String.valueOf(my_string.charAt(i)));
					list.add(num);  // list에 저장하고
					cNum = 0;   // cNum을 0을 저장하여 값을 초기화
					break;
				}
				cNum++; //cNum을 1씩 증가시키며 조건문에 대입
			}
		}
        list.sort(null);    // 해당 list를 오름차순 정렬
        
        
            
        
        return list;
    }
}