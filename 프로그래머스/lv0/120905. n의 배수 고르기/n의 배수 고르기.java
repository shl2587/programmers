class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int length = 0; // answer배열의 길이를 저장할 length 정수 변수 선언 및 0으로 초기화
        for (int i = 0; i < numlist.length; i++) {  // numlist의 길이만큼 반복회수 제어
            if(numlist[i] % n == 0) {   // numlist의 i번째요소가 n으로 나누어 떨어지면
                length++;   // 길이를 추가
            }
        }
        
        answer = new int[length];   // answer 배열 선언 한뒤
        int j = 0;  // answer 배열의 인덱스를 정할 j 정수 변수 선언 및 0으로 초기화
        for (int i = 0; i < numlist.length; i++) {  // numlist의 길이만큼 반복회수 제어
            if(numlist[i] % n == 0) {   // numlist의 i번째요소가 n으로 나누어 떨어지면
                answer[j] = numlist[i]; // answer 배열에 해당 요소를 추가하고
                j++;    // answer인덱스를 1증가
            }
        }
        
        return answer;
    }
}