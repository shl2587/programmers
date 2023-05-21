import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String result = "";
        for (int i = 0; i < myStr.length(); i++) {
            if (!('a' <= myStr.charAt(i) && myStr.charAt(i) <= 'c')) {
            	result += myStr.charAt(i);            	
            }
            else if (!result.equals("")) {
            	list.add(result);
            }
            if ('a' <= myStr.charAt(i) && myStr.charAt(i) <= 'c') {
            	result = "";
            }
        }

        
        if (list.size() == 0 && result.length() != 1) {
            list.add("EMPTY");    
        }
        else {
        	list.add(result);
        }
        
        return list;
    }
}