class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        char[] arr = new char[answer.length()];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = answer.charAt(i);
        }
        answer = "";
        for (int i = arr.length-1; i >= 0; i--) {
        answer += arr[i];
        }
        return answer;
    }
}