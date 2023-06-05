import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        char[] cArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        ArrayList<String> list = new ArrayList<>();
        int i = 0;

        while (age != 0) {
            list.add(String.valueOf(cArr[age % 10]));
            age /= 10;
            i++;
        }
        
        for (int j = list.size()-1; j != -1; j--) {
            answer += list.get(j);
        }
        
        return answer;
    }
}