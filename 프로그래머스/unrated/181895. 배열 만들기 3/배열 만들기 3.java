class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // intervals의 0번째 인덱스의 1번째 인덱스 요소에서 0번째 인덱스 요소를 빼고 + 1을 더해준 값과
        // intervals의 1번째 인덱스의 1번째 인덱스 요소에서 0번째 인덱스 요소를 빼고 + 1을 더해준 값을 더해준 값을
        // size로 정해줍니다.
        int size = (intervals[0][1] - intervals[0][0]) + 1 + (intervals[1][1] - intervals[1][0]) + 1;
        int[] answer = new int[size];
        int index = 0;  // answer의 인덱스를 통제할 index정수 변수 선언
                        // 연이어 넣어줘야 하기 때문에 해당 인덱스 통제방식이 적합
        // intervals의 0번째 인덱스의 0번째 인덱스 요소를 i로 하고 1번째 인덱스 요소까지 반복 제어
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[index] = arr[i]; // answer의 index번째에 arr[i]를 저장
            index++;                // index에 1씩 증가
        }
        // intervals의 0번째 인덱스의 0번째 인덱스 요소를 i로 하고 1번째 인덱스 요소까지 반복 제어
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer[index] = arr[i]; // answer의 index번째에 arr[i]를 저장
            index++;                // index에 1씩 증가
        }
        return answer;
    }
}