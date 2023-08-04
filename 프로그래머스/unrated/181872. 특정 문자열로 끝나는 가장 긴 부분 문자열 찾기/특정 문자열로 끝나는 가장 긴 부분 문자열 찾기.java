class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = myString.indexOf(pat) + pat.length();
        String str = myString.substring(index);
        answer = myString.substring(0, index);

        while (str.contains(pat)) {
            index = str.indexOf(pat)+pat.length();
            answer += str.substring(0, index);    
            str = str.substring(index);
        }
        
        
        
        
        return answer;
    }
}