class Solution {
    public int[] solution(String myString) {
        int size = 1;   // x의 개수보다 크기가 1많기 때문에 size 정수 변수에 1로 초기화
        // 반복을 myString의 길이만큼 횟수 제어
        for (int i = 0; i < myString.length(); i++) {
            if ('x' == myString.charAt(i)) {    // i번째 문자열이 'x'와 같으면
                size++; // size를 1증가
            }
        }
        
        int cnt = 0;    // x가 아닌 문자열의 개수를 세기 위한 cnt 정수 문자열 선언 및 0으로 초기화
        int index = 0;  // answer의 index를 0으로 초기화
        int[] answer = new int[size];   // size크기의 answer 정수 배열 선언
        for (int i = 0; i < myString.length(); i++) {   // myString의 길이만큼 반복 회수 제어
            if ('x' == myString.charAt(i)) {    // x가 myString의 i번째 문자열과 같다면
                answer[index] = cnt;    // answer의 index번째에 cnt를 저장
                cnt = 0;    // cnt에 0을 저장하여 초기화시키고
                index++;    // index를 1증가
            }
            else {  // 무조건적인 cnt의 증가를 막기위한 else 조건문 설정
                cnt++;  // cnt 1증가
                if (i == myString.length() - 1) {   // i가 myString의 마지막 문자열의 인덱스와 같다면
                    answer[index] = cnt;    // cnt를 answer 마지막 배열에 저장
                }
            }
        }
        
        
        return answer;
    }
}