import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String result = ""; // 나눈 문자열을 저장할 result 문자열 변수 선언
        for (int i = 0; i < myStr.length(); i++) {
            // 해당 열의 문자열이 a, b, c 중 하나가 아닐 때 
            if (!('a' <= myStr.charAt(i) && myStr.charAt(i) <= 'c')) { 
                // result에 해당 문자열을 더해줌
            	result += myStr.charAt(i);            	
            }
            // 해당 열의 문자열이 a, b, c 중 하나가 아니면서 빈문자열이 아니면
            else if (!result.equals("")) {
            	// 해당 list에 result 문자열 추가
                list.add(result); 
            }
            // a, b, c 중에 하나면
            if ('a' <= myStr.charAt(i) && myStr.charAt(i) <= 'c') {
            	// 빈문자열 저장
                result = "";
            }
        }

        // list 크기가 0이고 result의 길이가 1이 아니면
        // 중복되는 문자열이 없다는 의미이므로
        if (list.size() == 0 && result.length() != 1) {
            // list에 EMPTY를 추가
            list.add("EMPTY");    
        }
        // list에 result 추가
        else {
        	list.add(result);
        }
        
        return list;
    }
}