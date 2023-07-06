class Solution {
    public int solution(int[] box, int n) {
        int result1 = box[0] / n;
        int result2 = box[1] / n;
        int result3 = box[2] / n;
        
        return result1 * result2 * result3;
    }
}