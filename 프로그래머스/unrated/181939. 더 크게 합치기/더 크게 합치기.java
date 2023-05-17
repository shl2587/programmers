class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int result1 = Integer.parseInt(ab);
        int result2 = Integer.parseInt(ba);
        
        return  result1 < result2 ? result2 : result1;
    }
}