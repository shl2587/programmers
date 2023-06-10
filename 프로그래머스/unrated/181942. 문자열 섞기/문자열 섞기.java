class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) { // str1의 크기만큼 반복
            answer += str1.charAt(i);   // answer에 str1.charAt(i) 더함
            answer += str2.charAt(i);   // answer에 str2.charAt(i) 더함
        }
        return answer;
    }
}