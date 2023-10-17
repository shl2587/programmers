import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        
        int length = dots[dots.length - 1][0] - dots[0][0];
        
        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        
        int width = dots[dots.length - 1][1] - dots[0][1];
        
        answer = length * width;
        
        
        
        return answer;
    }
}