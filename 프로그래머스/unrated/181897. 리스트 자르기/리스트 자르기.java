class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null;
        int index = 0;
        
        if (n == 1) {
            answer = new int[slicer[1]+1];
            for (int i = 0; i <= slicer[1]; i++) {
                answer[i] = num_list[i];
            }
        }
        if (n == 2) {
            answer = new int[num_list.length-slicer[0]];
            for (int i = slicer[0]; i < num_list.length; i++) {
                answer[index] = num_list[i];
                index++;
            }
        }
        if (n == 3) {
            answer = new int[slicer[1]-slicer[0]+1];
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                answer[index] = num_list[i];
                index++;
            }
        }
        if (n == 4) {
            answer = new int[(slicer[1] - slicer[0]) / 2 + 1];
            for (int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
                answer[index] = num_list[i];
                index++;
            }
        }
        return answer;
    }
}