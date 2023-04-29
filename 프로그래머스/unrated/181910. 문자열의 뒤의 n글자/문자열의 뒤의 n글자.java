class Solution {
    public String solution(String my, int n) {
        // 전체 문자열 길이에서 n을 빼면 해당 숫자가 문자열 제외의 시작점이 됨
        // - 배열의 인덱스와 String의 인덱스는 동일
        // - substring은 인자를 하나만 할당하면 해당 인덱스부터 끝까지 문자열 추출
        String answer = my.substring(my.length() - n);
        return answer;
    }
}