class Solution {
    public int[] solution(int[] arr) {
        int front = 0;  // arr의 2의 요소가 시작되는 인덱스
        int end = 0;    // arr의 2의 요소의 마지막 인덱스
        // 처음부터 배열을 반복하여 시작점 확인
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                front = i;
                break;
            }
        }
        // 마지막부터 배열을 반복하여 끝 지점 확인
        for (int i = arr.length-1; i != -1; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        // end에서 front까지의 크기로 하는 answer배열 선언
        int[] answer = new int[end - front + 1];
        int index = 0;  // answer 배열의 index
        // end가 0이 아니면 2의 요소가 존재한다는 의미이므로
        if (end != 0) {
            // 해당 범위의 배열을 answer에 넣어줌
            for (int i = front; i < end + 1; i++) {
                answer[index] = arr[i];
                index++;
            }
        }
        // end가 0이라면 arr에 2의 요소가 없다는 의미이므로
        else {
            // answer에 -1을 삽입
            answer[index] = -1;
        }
        return answer;
    }
}