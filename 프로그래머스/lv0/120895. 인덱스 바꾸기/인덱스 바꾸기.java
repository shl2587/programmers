class Solution {
    public String solution(String my, int num1, int num2) {
        String answer = "";
        String[] arr = new String[my.length()];
        String word1 = String.valueOf(my.charAt(num1));
        String word2 = String.valueOf(my.charAt(num2));
        
        for (int i = 0; i < my.length(); i++) {
            if (i == num1) {
                arr[i] = String.valueOf(my.charAt(num2));    
            }
            else if (i == num2) {
                arr[i] = String.valueOf(my.charAt(num1));
            }
            else {
                arr[i] = String.valueOf(my.charAt(i));
            }
        }
        
        for (int i = 0; i < my.length(); i++) {
            answer += arr[i];
        }
        
        
        
        return answer;
    }
}