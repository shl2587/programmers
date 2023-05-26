class Solution {
    public int solution(int n, String control) {
        char str;
        
        for (int i = 0; i < control.length(); i++) {
            str = control.charAt(i);
            if (str == 'w') n += 1;
            if (str == 's') n -= 1;
            if (str == 'd') n += 10;
            if (str == 'a') n -= 10;
        }
        
        return n;
    }
}