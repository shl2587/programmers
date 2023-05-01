class Solution {
    public int[] solution(String[] strlist) {
        String str = ""; // 배열 요소를 담아주기 위한 문자열 str 변수 선언
        int[] arr = new int[strlist.length];    // 길이 요소를 담아줄 정수 배열 arr 생성
        for (int i = 0; i < strlist.length; i++) {  // strlist 길이만큼 반복문 제어
            str = strlist[i];       // str 변수에 strlist요소를 저장
            arr[i] = str.length();  // 길이를 정수 배열 arr에 차례대로 저장
        }
        return arr;
    }
}