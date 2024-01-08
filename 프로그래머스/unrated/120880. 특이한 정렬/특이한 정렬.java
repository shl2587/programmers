import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        int[] answer = new int[numlist.length];
        int[] difference = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            int result = n - numlist[i];
            if (result < 0) {
                result *= -1;
            }
            difference[i] = result;
        }
        
        for (int i = 0; i < numlist.length; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                int tmp1 = 0;
                int tmp2 = 0;
                if (difference[i] >= difference[j]) {
                    tmp1 = difference[i];
                    difference[i] = difference[j];
                    difference[j] = tmp1;
                    tmp2 = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp2;
                }
            }
        }

        return numlist;
    }
}