class Solution {
    public int[] solution(int[] arr) {
        int num = 1;    // 거듭제곱을 구하기 위한 num 정수변수 선언 및 1로 초기화
        // 필요한 2의 거듭제곱을 구하는 반복문
        while(arr.length - num > 0) {
            num *= 2;
        }
        // 배열의 크기는 num과 동일
        int[] answer = new int[num];
        // answer에 arr요소를 삽입
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}