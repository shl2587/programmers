class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size += arr[i];
        }
        int cnt = 0;    // 저장 반복 횟수를 제어할 cnt
        int index = 0;  // arr의 인덱스를 제어할 index
        int[] answer = new int[size];   // 앞서 구한 크기로 answer를 생성
        for (int i = 0; i < size; i++) {    // size만큼 반복회수 제어
            if (cnt == arr[index]) {        // cnt와 arr의 index번째 요소가 같으면
                                            // - 해당 요소 만큼 값을 저장했다는 의미
                index++;                    // index를 1증가시키고
                cnt = 0;                    // cnt는 0을 저장
            }
            answer[i] = arr[index];         // answer[i]에 arr의 index번째 요소를 저장
            cnt++;      // cnt를 1씩 카운트 해줌
        }
        return answer;
    }
}