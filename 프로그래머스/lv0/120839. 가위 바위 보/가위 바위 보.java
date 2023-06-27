class Solution {
    public String solution(String rsp) {
        String answer = "";
        String rock = "0", scissors = "2", paper = "5";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == rock.charAt(0)) {
                answer += paper;
            }
            else if (rsp.charAt(i) == scissors.charAt(0)) {
                answer += rock;
            }
            else {
                answer += scissors;
            }
        }
        return answer;
    }
}