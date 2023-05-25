class Solution {
    public int solution(String my, String is_prefix) {
        int answer = 0;
        // 접두사인지 확인하기 위해 첫글자가 같은지 해당 문자열이 포함되는지 판단하여
        if (my.length() >= is_prefix.length()) {
            for (int i = 0; i < is_prefix.length(); i++) {
                if(my.charAt(i) == is_prefix.charAt(i)) {
                    answer = 1; // answer에 1을 저장
                }
                else {
                    answer = 0; // 그렇지 않으면 answer에 0을 저장
                }
            }
        }
        return answer;
    }
}