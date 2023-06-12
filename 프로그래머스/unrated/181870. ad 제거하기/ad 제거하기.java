import  java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        
        // strArr의 길이만큼 반복 회수 제어
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) { // strArr[i]에 "ad"가 포함되어 있지 않으면
                list.add(strArr[i]); // 해당 순번째 list 요소를 제거
            }
        }
        return list;
    }
}