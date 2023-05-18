class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length / n + 1; // answer변수의 크기를 지정해줄 size선언 및 크기 지정
        if (num_list.length % n == 0) {
            size = num_list.length / n;
        }
        int[] answer = new int[size];   // 정답을 담을 answer 배열 변수 선언
        int index = 0;
        for (int i = 0; i < num_list.length; i+=n) {    // num_list의 길이만큼 반복 횟수 제어
                                                        // 0번째 인덱스 삽입 후 n번만큼 다음의 요소를 삽입
            answer[index] = num_list[i];            // answer에 num_list의 조건에 맞는 요소 삽입
            index++;
        }
        
        
        return answer;
    }
}