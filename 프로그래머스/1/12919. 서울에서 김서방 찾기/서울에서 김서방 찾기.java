class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        int idx = 0;
        for (String str : seoul) {
            if ("Kim".equals(str)) {
                break;
            }
            idx++;
        }
        answer = String.format(answer, idx);
        return answer;
    }
}