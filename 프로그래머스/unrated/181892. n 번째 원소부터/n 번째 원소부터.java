class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];    // n부터 끝까지 이므로 크기를
                                                            // num_list 길이에서 n을 빼주고 1을 더함
        int index = n;      // n으로 인덱스 통제 시 범위의 변화가 생길 수 있음
        
        // i로 answer변수의 인덱스를 통제
        for (int i = 0; i < num_list.length - n + 1; i++) {
            // answer 배열에 numlist 요소를 저장
            answer[i] = num_list[index - 1];
            // index를 1씩 증가
            index++;
        }
        return answer;
    }
}