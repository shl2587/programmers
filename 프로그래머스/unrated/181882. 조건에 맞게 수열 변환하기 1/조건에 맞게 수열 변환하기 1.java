class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {  // 해당 요소가 50보다 크거나 같고 짝수이면
                answer[i] = arr[i] / 2; // arr[i]에 2를 나누어 answer[i]에 저장하고
            }
            else if (arr[i] < 50 && arr[i] % 2 != 0) {  // 해당 요소가 50보다 작고 홀수이면
                answer[i] = arr[i] * 2; // arr[i]에 2를 곱하여 answer[i]에 저장
            }
            else {  // 위의 조건을 모두 만족하지 않는다면
                answer[i] = arr[i]; // answer[i]에 그대로 저장
            }
        }
        
        return answer;
    }
}