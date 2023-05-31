class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0; // num_list의 n 이전의 
        for (int i = 0; i < num_list.length; i++) { // num_list의 길이만큼 반복회수 제어
            if (n < num_list.length) {  // n이 num_list의 길이보다 작으면
                answer[i] = num_list[n];    // answer에 0번째 인덱스부터 num_list의 n번 인덱스부터 삽입
                n++;                        // n을 1씩 증가
            }
            else {
                answer[i] = num_list[index];    // 남은 answer배열 공간에 num_list 0번째부터 n-1번째 요소를 삽입
                index++;    // index를 1씩 증가
            }
        }
        
        return answer;
    }
}