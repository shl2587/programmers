import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        int tmp = 0;
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }   
            }
        }
        
        int[] answer = new int[2];
        answer[0] = array[array.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (answer[0] == arr[i]) {
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}