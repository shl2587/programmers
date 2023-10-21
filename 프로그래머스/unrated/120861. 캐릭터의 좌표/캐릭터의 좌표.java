import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < keyinput.length; i++) {
            if("right".equals(keyinput[i])) {
                x++;
            }
            if("left".equals(keyinput[i])) {
                x--;
            }
            if("up".equals(keyinput[i])) {
                y++;
            }
            if("down".equals(keyinput[i])) {
                y--;
            }
            if (x > 0 && x > board[0] / 2) {
                x = board[0] / 2;
            }
            if (x < 0 && x < (board[0] / 2) * -1) {
                x = (board[0] / 2) * -1;
            }
            if (y > 0 && y > board[1] / 2) {
                y = board[1] / 2;
            }
            if (y < 0 && y < (board[1] / 2) * -1) {
                y = (board[1] / 2) * -1;
            }
        }
        
        
        
        int[] answer = {x, y};
        return answer;
    }
}