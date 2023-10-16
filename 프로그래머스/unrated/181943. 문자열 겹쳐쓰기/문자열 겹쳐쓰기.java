class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // replace하기 위한 시작 인덱스 s와 overwirte_string.length()를 더한 값을 저장
        int replace_end_idx = overwrite_string.length() + s;
        // StringBuffer를 활용한 replace내장 함수 이용을 위한 StringBuffer sb객체 생성
        StringBuffer sb = new StringBuffer();
        // sb에 my_string문자열 저장
        sb.append(my_string);
        // replace함수 활용하여 my_string의 s부터 replace_end_idx까지를 overwirte_string으로 변환
        sb.replace(s, replace_end_idx, overwrite_string);
        
        // answer에 sb를 String 자료형으로 변환하여 저장
        answer = String.valueOf(sb);
        return answer;
    }
}