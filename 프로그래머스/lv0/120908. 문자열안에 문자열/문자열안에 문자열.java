class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        if (!str1.contains(str2)) { // str1안에 str2가 있다면
            return 2;   // 2를 반환
        }
        return answer;
    }
}